package no.nav.arbeid.euresapi.domain.legacy.converter;

import ch.qos.logback.classic.Logger;
import no.nav.arbeid.euresapi.domain.CodeRepository;
import no.nav.arbeid.euresapi.domain.eures.GetReply2018;
import no.nav.arbeid.euresapi.domain.eures.GetReplyItem2018;
import no.nav.arbeid.euresapi.domain.eures.GetReplyUrl2018;
import no.nav.arbeid.euresapi.domain.legacy.*;
import no.nav.arbeid.euresapi.services.eures.LegacyEuresGateway;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;
import java.util.function.Supplier;

import static no.nav.arbeid.euresapi.domain.legacy.JobFacet.*;
import static no.nav.arbeid.euresapi.domain.legacy.Url.URL_NAME_EURES_PORTAL;

@Component
public class ToLegacyConverter {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ToLegacyConverter.class);

    public static final String DEFAULT_CODE_VALUE = "Uspesifisert";

    private final Supplier<CodeRepository> codeRepository;


    public ToLegacyConverter(CodeRepository codeRepository) {
        this.codeRepository = () -> codeRepository;
    }

    @Autowired
    public ToLegacyConverter(LegacyEuresGateway euresGateway) {

        codeRepository = CodeRepository.lazyInitialized(euresGateway);
    }


    public SearchJobsReply convert(final GetReply2018 getReply) {

        final Data data = new Data();

        for (final GetReplyItem2018 item : getReply.getData().getItems()) {

            HrXmlParser parser = new HrXmlParser(item.getGetReplyJobVacancy().getHrxml());

            final Item searchJobsReplyItem = new Item();

            searchJobsReplyItem.setAuditInfo(new AuditInfo(
                    item.getGetReplyAuditInfo().getCreationTimestamp(),
                    item.getGetReplyAuditInfo().getModificationTimestamp(),
                    null)
            );
            searchJobsReplyItem.getJobFacets().add(
                    new JobFacet(FACET_NAME_LOCATION,
                            null,
                            getCodeValue(CodeRepository.CodeListName.COUNTRY.getName(), parser.getLocationFacet()).orElse(DEFAULT_CODE_VALUE)));

            searchJobsReplyItem.getJobFacets().add(new JobFacet(FACET_NAME_CONTRACT_TYPE,
                    null,
                    getCodeValue(CodeRepository.CodeListName.CONTRACT_TYPE.getName(), parser.getContractTypeFacet()).orElse(DEFAULT_CODE_VALUE)));

            searchJobsReplyItem.getJobFacets().add(new JobFacet(FACET_NAME_CONTRACT_DURATION,
                    null,

                    getCodeValue(
                            CodeRepository.CodeListName.CONTRACT_DURATION.getName(),
                            parser.getContractDurationFacet()
                    )
                            .orElse(DEFAULT_CODE_VALUE)));
            searchJobsReplyItem.getJobFacets().add(buildExperienceJobFacetFromUnitAndMeasure(parser));
            searchJobsReplyItem.getJobFacets().add(new JobFacet(FACET_NAME_OCCUPATION, null, parser.getOccupationFacet()));

            searchJobsReplyItem.setRelated(new Related(Collections.singletonList(new Url(URL_NAME_EURES_PORTAL, getEuresPortalUrl(item)))));

            JobVacancyHeader header = new JobVacancyHeader(
                    item.getGetReplyJobVacancy().getGetReplyJobVacancyHeader().getHandle(),
                    null,
                    null,
                    item.getGetReplyJobVacancy().getGetReplyJobVacancyHeader().getDataSourceId(),
                    parser.getTitle(),
                    prepareForRendering(parser.getJobDescription()),
                    parser.getNamePosts(),
                    parser.getEmployerName(),
                    parser.getSalaryCurrencyCode(),
                    parser.getMaxiumalSalary(),
                    parser.getMinimalSalary(),
                    parser.getSalaryPeriodCode(),
                    null,
                    parser.getLastApplicationDate(),
                    parser.getEndDate(),
                    parser.getStartDate()


            );

            searchJobsReplyItem.setJobVacancyHeader(header);

            data.getItems().add(searchJobsReplyItem);
        }

        return new SearchJobsReply(null, data);
    }

    @Deprecated
    private String getEuresPortalUrl(GetReplyItem2018 item) {
        return item.getGetReplyRelated().getUrls()
                .stream()
                .filter(
                        (getReplyUrl) -> URL_NAME_EURES_PORTAL.equals(getReplyUrl.getUrlName())
                )
                .findFirst()
                .map(GetReplyUrl2018::getUrlValue)
                .orElse(null);
    }

    /**
     * Get the code value for list name and code name, but if no such is found,
     * use the key as the searched for value if it is null.
     *
     * @param listName The name of the map to supply the code value (key in the outer map)
     * @param codeName The name of the code (key in the inner map)
     * @return codeName     null: always Optional.empty()
     * codeName not null: lookup value if it exists, otherwise codeName
     */
    private Optional<String> getCodeValue(final String listName, final String codeName) {

        return codeRepository.get().getCodeValue(listName, codeName, true);
    }

    private String prepareForRendering(final String stringToBeprepared) {


        return (stringToBeprepared == null) ? null :
                stringToBeprepared.replaceAll("\\n", "<BR/>").replaceAll("\\t", "&emsp;");
    }

    private JobFacet buildExperienceJobFacetFromUnitAndMeasure(HrXmlParser parser) {

        final String unit = parser.getExperienceUnit();
        final String measure = parser.getExperienceMeasure();

        final String facetDescription;
        if ((unit == null) || (measure == null)) {

            facetDescription = getCodeValue(
                            CodeRepository.CodeListName.EXPERIENCE.getName(),
                            null) // TODO seems to be ignored in the original code
                    .orElse(DEFAULT_CODE_VALUE);
        } else {

            final String translatedUnit = getCodeValue(
                            CodeRepository.CodeListName.EXPERIENCE_UNIT_GB_NO.getName(),
                            unit)
                    .orElse(DEFAULT_CODE_VALUE);
            facetDescription = measure + " " + translatedUnit;
        }

        return new JobFacet(FACET_NAME_EXPERIENCE, null, facetDescription);
    }

}