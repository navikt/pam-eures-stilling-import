package no.nav.arbeid.euresapi.domain;

import ch.qos.logback.classic.Logger;
import no.nav.arbeid.euresapi.domain.legacy.Code;
import no.nav.arbeid.euresapi.domain.legacy.CodeList;
import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReply;
import no.nav.arbeid.euresapi.services.eures.LegacyEuresGateway;
import no.nav.arbeid.euresapi.util.HashMapWithDefVal;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CodeRepository {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(CodeRepository.class);

    private static final String CODE_LIST_NAME_CONTRACT_DURATION = "CONTRACT DURATION";
    private static final String CODE_LIST_NAME_CONTRACT_TYPE = "CONTRACT TYPE";
    private static final String CODE_LIST_NAME_COUNTRY = "COUNTRY";
    private static final String CODE_LIST_NAME_EXPERIENCE = "EXPERIENCE";
    private static final String CODE_LIST_NAME_EXPERIENCE_UNIT_GB_NO = "EXPERIENCE_UNIT_GB_NO";
    private static final String CODE_LIST_NAME_PUBLICATION_PERIOD = "PUBLICATION PERIOD";
    private static final String CODE_LIST_NAME_REGION = "REGION";
    private static final String CODE_LIST_NAME_SECTOR = "SECTOR";

    Map<String, Optional<Map<String, Optional<String>>>> getCodeMaps() {
        return codeMaps;
    }

    public enum CodeListName {

        CONTRACT_DURATION(CODE_LIST_NAME_CONTRACT_DURATION),
        CONTRACT_TYPE(CODE_LIST_NAME_CONTRACT_TYPE),
        COUNTRY(CODE_LIST_NAME_COUNTRY),
        EXPERIENCE(CODE_LIST_NAME_EXPERIENCE),
        EXPERIENCE_UNIT_GB_NO(CODE_LIST_NAME_EXPERIENCE_UNIT_GB_NO),
        PUBLICATION_PERIOD(CODE_LIST_NAME_PUBLICATION_PERIOD),
        REGION(CODE_LIST_NAME_REGION),
        SECTOR(CODE_LIST_NAME_SECTOR);

        public String getName() {
            return name;
        }

        private static class NamesHelper {
            private static final Set<String> names = new HashSet<>();
        }

        private final String name;

        CodeListName(final String name) {
            if (NamesHelper.names.add(name)) {
                this.name = name;
            } else {
                throw new IllegalArgumentException(
                        "A code list name was tried added more than once: " + name
                );
            }
        }

        public static Set<String> getNames() {
            return Collections.unmodifiableSet(NamesHelper.names);
        }
    }

    public static Supplier<CodeRepository> lazyInitialized(LegacyEuresGateway euresGateway) {
        class LazyCodeRepositry implements Supplier<CodeRepository> {
            private CodeRepository codeRepository;

            public CodeRepository get() {
                if (codeRepository == null) {

                    final GetCodeListsReply getCodeListsReply = euresGateway.getCodeLists();
                    codeRepository = new CodeRepository(getCodeListsReply);
                }
                return codeRepository;
            }
        }
        return new LazyCodeRepositry();
    }

    private final Map<String, Optional<Map<String, Optional<String>>>> codeMaps;

    public CodeRepository(final GetCodeListsReply getCodeListsReply) {
        this.codeMaps = CodeRepository.createCodeMaps(getCodeListsReply);
    }

    /**
     * Get codes from eures, and cache them in a map of maps for later use.
     */
    private static Map<String, Optional<Map<String, Optional<String>>>>
    createCodeMaps(final GetCodeListsReply getCodeListsReply) {

        final Map<String, Optional<Map<String, Optional<String>>>> hardCodedCodeLists =
                createHardCodedCodeLists();

        final Supplier<Map<String, Optional<String>>> innerMapCreationFunction =
                () -> new HashMapWithDefVal<>(Optional.empty());

        final Collector<
                Code,
                Map<String, Optional<String>>,
                Map<String, Optional<String>>> innerCollector =
                Collector.of(
                        innerMapCreationFunction,
                        (innerMapForAccumulation, code) ->
                                innerMapForAccumulation.put(
                                        code
                                                .getCodeValue(),
                                        Optional.of(
                                                code
                                                        .getCodeDescription()
                                        )),
                        (innerMapForMergingFrom, innerMapForMergingTo) -> {
                            innerMapForMergingTo.putAll(innerMapForMergingFrom);
                            return innerMapForMergingTo;
                        },
                        (readilyPreparedInnerMap) -> Collections.unmodifiableMap(readilyPreparedInnerMap)
                );

        final Supplier<Map<String, Optional<Map<String, Optional<String>>>>> outerMapCreationFunction =
                () -> new HashMapWithDefVal<>(Optional.empty());

        final Collector<
                CodeList,
                Map<String, Optional<Map<String, Optional<String>>>>,
                Map<String, Optional<Map<String, Optional<String>>>>> outerCollector =
                Collector.of(
                        outerMapCreationFunction,
                        (outerMapForAccumulation, codeList) ->
                                outerMapForAccumulation.put(
                                        codeList
                                                .getCodeListName(),
                                        Optional.of(
                                                codeList
                                                        .getCodes()
                                                        .stream()
                                                        .collect(
                                                                innerCollector
                                                        )
                                        )
                                ),
                        (outerMapForMergingFrom, outerMapForMergingTo) -> {
                            outerMapForMergingTo.putAll(outerMapForMergingFrom);
                            return outerMapForMergingTo;
                        },
                        (readilyPreparedOuterMap) -> {
                            readilyPreparedOuterMap.putAll(hardCodedCodeLists);
                            return Collections.unmodifiableMap(readilyPreparedOuterMap);
                        }
                );

        final Map<String, Optional<Map<String, Optional<String>>>> codeRepository =
                getCodeListsReply
                        .getData()
                        .getCodeLists()
                        .stream()
                        .filter(codeList ->
                                (
                                        CodeListName.getNames().contains(codeList.getCodeListName())
                                )
                        )
                        .collect(outerCollector);

        return codeRepository;
    }

    /**
     * TODO: Hard coding values to be presented for the user is not a good thing.
     *
     * @return
     */
    private static Map<String, Optional<Map<String, Optional<String>>>>
    createHardCodedCodeLists() {

        final Map<String, Optional<String>> experienceUnits =
                new HashMap<String, Optional<String>>() {
                    {
                        put("km", Optional.of("km"));
                        put("day", Optional.of("dag(er)"));
                        put("week", Optional.of("uke(r)"));
                        put("month", Optional.of("måned(er)"));
                        put("year", Optional.of("år"));
                    }
                };

        final Map<String, Optional<Map<String, Optional<String>>>> hardCodedCodeLists =
                new HashMap<String, Optional<Map<String, Optional<String>>>>() {
                    {
                        put(CODE_LIST_NAME_EXPERIENCE_UNIT_GB_NO, Optional.of(experienceUnits));
                    }
                };

        return Collections.unmodifiableMap(hardCodedCodeLists);
    }

    /**
     * Get the code value for list name and code name.
     *
     * @param listName The name of the map to supply the code value (key in the outer map)
     * @param codeName The name of the code (key in the inner map)
     * @return The found match baked into an optional.
     */
    Optional<String> getCodeValue(
            final String listName,
            final String codeName) {

        Optional<Map<String, Optional<String>>> stringOptionalMap = getCodeMaps().get(listName);

        if(stringOptionalMap.isEmpty())
            return Optional.empty();

        if(stringOptionalMap.get().get(codeName) == null || stringOptionalMap.get().get(codeName).isEmpty())
            return Optional.empty();

        return stringOptionalMap.get().get(codeName);
    }

    /**
     * Get the code value for list name and code name, but if no such is found,
     * use the key as the searched for value if it is null.
     *
     * @param listName                            The name of the map to supply the code value (key in the outer map)
     * @param codeName                            The name of the code (key in the inner map)
     * @param shouldUseKeyAsDefaultValueIfNotNull Whether the key value should
     *                                            be returned upon no match.
     * @return codeName     null: always Optional.empty()
     * codeName not null: lookup value if it exists, otherwise codeName
     */
    public Optional<String> getCodeValue(
            final String listName,
            final String codeName,
            final boolean shouldUseKeyAsDefaultValueIfNotNull) {

        final Optional<String> codeValueTemp = getCodeValue(listName, codeName);

        final Optional<String> codeValue;
        if (shouldUseKeyAsDefaultValueIfNotNull && !codeValueTemp.isPresent() && (codeName != null)) {
            codeValue = Optional.of(codeName);
        } else {
            codeValue = codeValueTemp;
        }

        return codeValue;
    }
}