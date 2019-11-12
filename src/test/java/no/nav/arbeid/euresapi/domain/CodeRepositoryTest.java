package no.nav.arbeid.euresapi.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.qos.logback.classic.Logger;
import com.google.common.collect.ImmutableSet;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReply;
import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReplyUtils;
import no.nav.arbeid.euresapi.domain.legacy.converter.ToLegacyConverter;
import org.junit.Test;
import org.slf4j.LoggerFactory;

public class CodeRepositoryTest {

    private static final Logger enteringTestHeaderLogger =
            (Logger) LoggerFactory.getLogger("EnteringTestHeader");
    private static final Logger LOGGER =
            (Logger) LoggerFactory.getLogger(CodeRepositoryTest.class);

    private static final String EXISTING_LIST_NAME = "SECTOR";
    private static final String EXISTING_CODE_NAME = "A";
    private static final String EXISTING_CODE_VALUE = "JORDBRUK, SKOGBRUK OG FISKE";

    private static final String NON_EXISTING_LIST_NAME = "Rubbish list";
    private static final String NON_EXISTING_CODE_NAME = "Rubbish code";

    private static class TestData {
        final String listName;
        final String codeName;
        final Boolean useKeyAsDefault;
        final Boolean expectedPresence;
        final String expectedCodeValue;

        TestData(String listName, String codeName, Boolean useKeyAsDefault, Boolean expectedPresence, String expectedCodeValue) {

            this.listName = listName;
            this.codeName = codeName;
            this.useKeyAsDefault = useKeyAsDefault;
            this.expectedPresence = expectedPresence;
            this.expectedCodeValue = expectedCodeValue;
        }
    }

    /**
     * Tuple content:
     * listName, codeName, useKeyAsDefault, expectedPresence, expectedCodeValue
     */
    private static final List<TestData> expectedCodeValuesOnListNameAndCodeName =
            Arrays.asList(
                    new TestData(null, null, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(null, null, true, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(null, NON_EXISTING_CODE_NAME, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(null, NON_EXISTING_CODE_NAME, true, true, NON_EXISTING_CODE_NAME),
                    new TestData(null, EXISTING_CODE_NAME, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(null, EXISTING_CODE_NAME, true, true, EXISTING_CODE_NAME),
                    new TestData(NON_EXISTING_LIST_NAME, null, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(NON_EXISTING_LIST_NAME, null, true, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(NON_EXISTING_LIST_NAME, NON_EXISTING_CODE_NAME, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(NON_EXISTING_LIST_NAME, NON_EXISTING_CODE_NAME, true, true, NON_EXISTING_CODE_NAME),
                    new TestData(NON_EXISTING_LIST_NAME, EXISTING_CODE_NAME, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(NON_EXISTING_LIST_NAME, EXISTING_CODE_NAME, true, true, EXISTING_CODE_NAME),
                    new TestData(EXISTING_CODE_NAME, EXISTING_LIST_NAME, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(EXISTING_CODE_NAME, EXISTING_LIST_NAME, true, true, EXISTING_LIST_NAME),
                    new TestData(EXISTING_LIST_NAME, null, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(EXISTING_LIST_NAME, null, true, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(EXISTING_LIST_NAME, NON_EXISTING_CODE_NAME, false, false, ToLegacyConverter.DEFAULT_CODE_VALUE),
                    new TestData(EXISTING_LIST_NAME, NON_EXISTING_CODE_NAME, true, true, NON_EXISTING_CODE_NAME),
                    new TestData(EXISTING_LIST_NAME, EXISTING_CODE_NAME, false, true, EXISTING_CODE_VALUE),
                    new TestData(EXISTING_LIST_NAME, EXISTING_CODE_NAME, true, true, EXISTING_CODE_VALUE)
            );

    @Test
    public void assert_that_CodeRepository_CodeListName_contains_what_it_should() {

        final Set<String> expectedValueStrings =
                Arrays
                        .asList(
                                "CONTRACT_DURATION", "CONTRACT_TYPE", "COUNTRY",
                                "EXPERIENCE", "EXPERIENCE_UNIT_GB_NO", "PUBLICATION_PERIOD",
                                "REGION", "SECTOR"
                        )
                        .stream()
                        .collect(Collectors.toSet());

        final Set<String> expectedCodeListNames =
                Arrays
                        .asList(
                                "CONTRACT DURATION", "CONTRACT TYPE", "COUNTRY",
                                "EXPERIENCE", "EXPERIENCE_UNIT_GB_NO", "PUBLICATION PERIOD",
                                "REGION", "SECTOR"
                        )
                        .stream()
                        .collect(Collectors.toSet());

        final Set<String> actualCodeListValueStrings =
                Stream.of(
                        CodeRepository
                                .CodeListName
                                .values()
                )
                        .map((val) -> val.toString())
                        .collect(Collectors.toSet());

        assertTrue(actualCodeListValueStrings.containsAll(expectedValueStrings));

        expectedCodeListNames
                .stream()
                .forEach(
                        (str ->
                                assertTrue("str: " + str, CodeRepository.CodeListName.getNames().contains(str))
                        )
                );

        assertTrue(CodeRepository.CodeListName.getNames().containsAll(expectedCodeListNames));

        assertEquals(8, CodeRepository.CodeListName.values().length);

        expectedValueStrings
                .stream()
                .forEach(
                        (str ->
                                assertNotNull(CodeRepository.CodeListName.valueOf(str))
                        )
                );
    }

    @Test
    public void a_correct_code_map_should_be_returned_when_asked_for() {

        enteringTestHeaderLogger.debug(null);

        // ---------------------------------------------------------------------

        final GetCodeListsReply getCodeListsReply =
                GetCodeListsReplyUtils.getGetCodeListsReplyUtils_001();

        final CodeRepository codeRepository = new CodeRepository(getCodeListsReply);

        // -------------------------------------------------------------------------
        final Map<String, Optional<Map<String, Optional<String>>>> actualCodeLists =
                codeRepository.getCodeMaps();

        assertNotNull(actualCodeLists);

        final Set<String> allExpectedCodeLists =
                ImmutableSet.of(
                        CodeRepository.CodeListName.CONTRACT_DURATION.getName(),
                        CodeRepository.CodeListName.CONTRACT_TYPE.getName(),
                        CodeRepository.CodeListName.COUNTRY.getName(),
                        CodeRepository.CodeListName.EXPERIENCE.getName(),
                        CodeRepository.CodeListName.EXPERIENCE_UNIT_GB_NO.getName(),
                        CodeRepository.CodeListName.PUBLICATION_PERIOD.getName(),
                        CodeRepository.CodeListName.REGION.getName(),
                        CodeRepository.CodeListName.SECTOR.getName()
                );

        allExpectedCodeLists
                .stream()
                .forEach(
                        (oneExpectedCodeList) -> {
                            assertTrue(
                                    "The code lists does not contain the expected code list: " + oneExpectedCodeList,
                                    actualCodeLists
                                            .keySet()
                                            .contains(oneExpectedCodeList)
                            );
                        }
                );

        assertEquals(allExpectedCodeLists.size(), actualCodeLists.size());

        assertEquals(CodeRepository.CodeListName.CONTRACT_DURATION.getName(), 12, actualCodeLists.get(CodeRepository.CodeListName.CONTRACT_DURATION.getName()).get().size());
        assertEquals(CodeRepository.CodeListName.CONTRACT_TYPE.getName(), 4, actualCodeLists.get(CodeRepository.CodeListName.CONTRACT_TYPE.getName()).get().size());
        assertEquals(CodeRepository.CodeListName.COUNTRY.getName(), 3, actualCodeLists.get(CodeRepository.CodeListName.COUNTRY.getName()).get().size());
        assertEquals(CodeRepository.CodeListName.EXPERIENCE.getName(), 6, actualCodeLists.get(CodeRepository.CodeListName.EXPERIENCE.getName()).get().size());
        assertEquals(CodeRepository.CodeListName.PUBLICATION_PERIOD.getName(), 4, actualCodeLists.get(CodeRepository.CodeListName.PUBLICATION_PERIOD.getName()).get().size());
        assertEquals(CodeRepository.CodeListName.REGION.getName(), 11, actualCodeLists.get(CodeRepository.CodeListName.REGION.getName()).get().size());
        assertEquals(CodeRepository.CodeListName.SECTOR.getName(), 2, actualCodeLists.get(CodeRepository.CodeListName.SECTOR.getName()).get().size());

        assertEquals("Kontrakt", actualCodeLists.get(CodeRepository.CodeListName.CONTRACT_DURATION.getName()).get().get("Contract").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.CONTRACT_DURATION.getName()).get().get("Rubbish"));
        assertEquals("Fleksibel", actualCodeLists.get(CodeRepository.CodeListName.CONTRACT_TYPE.getName()).get().get("FlexTime").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.CONTRACT_TYPE.getName()).get().get("Rubbish"));
        assertEquals("Østerrike", actualCodeLists.get(CodeRepository.CodeListName.COUNTRY.getName()).get().get("AT").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.COUNTRY.getName()).get().get("Rubbish"));
        assertEquals("Mellom 2 og 5 år", actualCodeLists.get(CodeRepository.CodeListName.EXPERIENCE.getName()).get().get("D").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.EXPERIENCE.getName()).get().get("Rubbish"));
        assertEquals("Siste dag", actualCodeLists.get(CodeRepository.CodeListName.PUBLICATION_PERIOD.getName()).get().get("last_day").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.PUBLICATION_PERIOD.getName()).get().get("Rubbish"));
        assertEquals("VLAAMS GEWEST", actualCodeLists.get(CodeRepository.CodeListName.REGION.getName()).get().get("BE2").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.REGION.getName()).get().get("Rubbish"));
        assertEquals("JORDBRUK, SKOGBRUK OG FISKE", actualCodeLists.get(CodeRepository.CodeListName.SECTOR.getName()).get().get("A").get());
        assertEquals(Optional.empty(), actualCodeLists.get(CodeRepository.CodeListName.SECTOR.getName()).get().get("Rubbish"));
    }

    @Test
    public void getCodeValue_should_return_correct_values_including_not_existing_ones() {

        enteringTestHeaderLogger.debug(null);

        // -------------------------------------------------------------------------

        final GetCodeListsReply getCodeListsReply =
                GetCodeListsReplyUtils.getGetCodeListsReplyUtils_001();

        final CodeRepository codeRepository = new CodeRepository(getCodeListsReply);

        // -------------------------------------------------------------------------

        expectedCodeValuesOnListNameAndCodeName
                .stream()
                .filter((expectedCodeValueOnlistNameAndCodeName) -> !expectedCodeValueOnlistNameAndCodeName.useKeyAsDefault)
                .forEach(
                        (expectedCodeValueOnlistNameAndCodeName) ->
                        {
                            final String listName = expectedCodeValueOnlistNameAndCodeName.listName;
                            final String codeName = expectedCodeValueOnlistNameAndCodeName.codeName;
                            final boolean expectedPresence = expectedCodeValueOnlistNameAndCodeName.expectedPresence;
                            final String expectedCodeValue = expectedCodeValueOnlistNameAndCodeName.expectedCodeValue;

                            LOGGER.info("\nAbout to test:\nlistName         : {}\ncodeName         : {}\nexpectedPresence : {}\nexpectedCodeValue: \"{}\"\n", listName, codeName, expectedPresence, expectedCodeValue);

                            // Also implicitly tests for not throwing:
                            final boolean actualPresence =
                                    codeRepository
                                            .getCodeValue(listName, codeName)
                                            .isPresent();

                            final String actualCodeValue =
                                    codeRepository
                                            .getCodeValue(listName, codeName)
                                            .orElse(ToLegacyConverter.DEFAULT_CODE_VALUE);

                            assertEquals(expectedPresence, actualPresence);
                            assertEquals(expectedCodeValue, actualCodeValue);
                        }
                )
        ;
    }

    @Test
    public void getCodeValue_should_return_correct_values_including_not_existing_ones_when_use_key_as_default_is_used() {

        enteringTestHeaderLogger.debug(null);

        // -------------------------------------------------------------------------

        final GetCodeListsReply getCodeListsReply =
                GetCodeListsReplyUtils.getGetCodeListsReplyUtils_001();

        final CodeRepository codeRepository = new CodeRepository(getCodeListsReply);
        // -------------------------------------------------------------------------

        expectedCodeValuesOnListNameAndCodeName
                .stream()
                .forEach(
                        (expectedCodeValueOnlistNameAndCodeName) ->
                        {
                            final String listName = expectedCodeValueOnlistNameAndCodeName.listName;
                            final String codeName = expectedCodeValueOnlistNameAndCodeName.codeName;
                            final boolean useKeyAsDefault = expectedCodeValueOnlistNameAndCodeName.useKeyAsDefault;
                            final boolean expectedPresence = expectedCodeValueOnlistNameAndCodeName.expectedPresence;
                            final String expectedCodeValue = expectedCodeValueOnlistNameAndCodeName.expectedCodeValue;

                            final String msg =
                                    MessageFormat.format("\nlistName         : {0}\ncodeName         : {1}\nuseKeyAsDefault  : {2}\nexpectedPresence : {3}\nexpectedCodeValue: \"{4}\"", listName, codeName, useKeyAsDefault, expectedPresence, expectedCodeValue);

                            LOGGER.info("\nAbout to test: " + msg);

                            // Also implicitly tests for exception:
                            final boolean actualPresence =
                                    codeRepository
                                            .getCodeValue(listName, codeName, useKeyAsDefault)
                                            .isPresent();

                            final String actualCodeValue =
                                    codeRepository
                                            .getCodeValue(listName, codeName, useKeyAsDefault)
                                            .orElse(ToLegacyConverter.DEFAULT_CODE_VALUE);

                            final String msg2 =
                                    MessageFormat.format(msg + "\nactualPresence   : {0}\nactualCodeValue  : \"{1}\"\n", actualPresence, actualCodeValue);

                            assertEquals(msg2 + "\n*** --> Error in Presence :", expectedPresence, actualPresence);
                            assertEquals(msg2 + "\n*** --> Error in CodeValue:", expectedCodeValue, actualCodeValue);
                        }
                )
        ;
    }
}