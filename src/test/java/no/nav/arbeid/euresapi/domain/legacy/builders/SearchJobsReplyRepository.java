package no.nav.arbeid.euresapi.domain.legacy.builders;

import no.nav.arbeid.euresapi.domain.legacy.*;
import no.nav.arbeid.euresapi.domain.request.*;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;

import static no.nav.arbeid.euresapi.domain.legacy.JobFacet.*;
import static no.nav.arbeid.euresapi.domain.legacy.Url.URL_NAME_EURES_PORTAL;

/**
 * Created by r149852 on 12.06.2017.
 */
@Repository
public class SearchJobsReplyRepository {

    public static SearchJobsReply getSearchJobsReply1() {
        Header header = new Header(
                "I tillegg til de generelle vilkaarene angitt under lenken under brua, maa man ikke glemme Cartago",
                new Parameters(searchJobsRequest(), "en"),
                new DataSetInfo("BEST_MATCH", 1, 10, 1, 4)
        );
        Data data = new Data(Collections.singletonList(item()));
        return new SearchJobsReply(header, data);
    }

    private static SearchJobsRequest searchJobsRequest() {
        return new SearchJobsRequest(
                new SearchCriteria(
                        new KeywordCriteria("en", Arrays.asList(keyword("System", "JOB_TITLE"), keyword("Analyst", "JOB_DESCRIPTION"))),
                        Collections.singletonList(new FacetCriterion(FACET_NAME_LOCATION, Arrays.asList("BE211", "BE231", "FR", "NO", "BE")))),
                new DataSetRequest(
                        "BEST_MATCH",
                        1,
                        10,
                        Arrays.asList(new DataSource(40), new DataSource(41), new DataSource(42))
                )
        );

    }

    private static Item item() {

        return new Item(
                jobVacancyHeader(),
                new AuditInfo("2017-05-23", null, "2017-06-03T19:49:17"),
                new JobRelevance("6.365536"),
                new CodeDescriptions(null, null, null),
                new Related(Collections.singletonList(euresUrl())),
                Arrays.asList(
                        new JobFacet(FACET_NAME_EURES_FLAG, "false", "Without EURES flag"),
                        new JobFacet(FACET_NAME_LOCATION, "BE1", "RGION DE BRUXELLES-CAPITALE / BRUSSELS HOOFDSTEDELIJK GEWEST"),
                        new JobFacet(FACET_NAME_OCCUPATION, "2151", "Electrical engineers")
                ));
    }

    private static JobVacancyHeader jobVacancyHeader() {
        JobVacancyHeader header = new JobVacancyHeader();

        header.setJobVacancyHandle("03a922c606754957ba0d7ec2f96714c3");
        header.setDataSourceId(43);
        header.setDataSourceName("Actiris, Public Employment Services, Belgium");
        header.setDataSourceUniqueJvId("462003");
        header.setTitle("System Engineer(h/f)");
        header.setJobDescription("Ceci est une entreprise de conseil en innovation et technologie active dans le domaine du soleil");
        header.setPosts(1);
        header.setEmployerName("VIATTECH Q&S");
        header.setSalaryCurrencyCode(null);
        header.setMaximalSalary(2000000.0);
        header.setMinimalSalary(1000000.0);
        header.setSalaryPeriodCode("PPTT");
        header.setSalaryTaxationCode("XYZ");
        header.setLastApplicationDate("2017-06-17");
        header.setEndDate("2017-07-02");
        header.setStartDate("2017-06-30");
        return header;
    }

    private static Url euresUrl() {
        return new Url(URL_NAME_EURES_PORTAL, "https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/fullscreenJvView?uuId=03a922c606754957ba0d7ec2f96714c3&jvId=462003&pesId=63");
    }

    private static Keyword keyword(String system, String job_title) {
        return new Keyword(system, job_title);
    }

    public SearchJobsReplyRepository() {
    }

}