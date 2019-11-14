package no.nav.arbeid.euresapi.controllers.euresapi;

import ch.qos.logback.classic.Logger;
import no.nav.arbeid.euresapi.domain.legacy.LegacyEuresApi;
import no.nav.arbeid.euresapi.domain.legacy.SearchJobsReply;
import no.nav.arbeid.euresapi.domain.legacy.builders.SearchJobsReplyRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class EuresApiRestControllerMockTest {

    private static final Logger logger =
        (Logger)LoggerFactory.getLogger(EuresApiRestControllerMockTest.class);

    private static final Logger enteringTestHeaderLogger =
        (Logger)LoggerFactory.getLogger("EnteringTestHeader");

    private static final String context = "/euresapi";
    private static final String restSubcontext = "/rest";
    private static final String contextAndRestSubcontext = context + restSubcontext;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ApplicationContext applicationContext;

    @MockBean
    private LegacyEuresApi euresApiServiceMock;

    @Before
    public void reset_mocks() throws Exception {

        for (String name : applicationContext.getBeanDefinitionNames()) {
            Object bean = applicationContext.getBean(name);
            if (AopUtils.isAopProxy(bean) && bean instanceof Advised) {
                bean = ((Advised)bean).getTargetSource().getTarget();
            }
            if (Mockito.mockingDetails(bean).isMock()) {
                Mockito.reset(bean);
            }
        }
    }

    @Test
    public void testSearchJobs() {

        enteringTestHeaderLogger.debug(null);

        final SearchJobsReply searchJobsReply = SearchJobsReplyRepository.getSearchJobsReply1();

        logger.debug("searchJobsReply: " + searchJobsReply.toString());
        logger.debug("searchJobsReply.getData(): " + searchJobsReply.getData());
        logger.debug("searchJobsReply.getHeader(): " + searchJobsReply.getHeader());

        when(euresApiServiceMock.searchJobs()).thenReturn(searchJobsReply);

        try {
          mockMvc
            .perform(get(contextAndRestSubcontext + "/SearchJobs"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON.toString()))
            //.andExpect(content().string("Hei, dette skal ikke være innholdet 777"))
            // One job match:
            .andExpect(jsonPath("$.data.items", hasSize(1)))
            // The only one job match has three job facets
            .andExpect(jsonPath("$.data.items[0].jobFacets", hasSize(3)))
            .andExpect(content().json("{\"header\":{\"disclaimer\":\"I tillegg til de generelle vilkaarene angitt under lenken under brua, maa man ikke glemme Cartago\",\"parameters\":{\"searchJobsRequest\":{\"searchCriteria\":{\"keywordCriteria\":{\"keywordLanguageCode\":\"en\",\"keywords\":[{\"keywordText\":\"System\",\"keywordScope\":\"JOB_TITLE\"},{\"keywordText\":\"Analyst\",\"keywordScope\":\"JOB_DESCRIPTION\"}]},\"facetCriteria\":[{\"facetName\":\"LOCATION\",\"facetValues\":[\"BE211\",\"BE231\",\"FR\",\"NO\",\"BE\"]}]},\"dataSetRequest\":{\"sortBy\":\"BEST_MATCH\",\"pageNumber\":1,\"resultsPerPage\":10,\"excludedDataSources\":[{\"dataSourceId\":40},{\"dataSourceId\":41},{\"dataSourceId\":42}]}},\"acceptLanguageHeader\":\"en\"},\"dataSetInfo\":{\"sortBy\":\"BEST_MATCH\",\"pageNumber\":1,\"resultsPerPage\":10,\"totalPageCount\":1,\"totalMatchingJobVacanciesCount\":4}},\"data\":{\"items\":[{\"jobVacancyHeader\":{},\"auditInfo\":{\"creationDate\":\"2017-05-23\",\"modificationDate\":null,\"replicationTimestamp\":\"2017-06-03T19:49:17\"},\"jobRelevance\":{\"relevanceScore\":\"6.365536\"},\"codeDescriptions\":{\"salaryCurrencyDescription\":null,\"salaryPeriodDescription\":null,\"salaryTaxationDescription\":null},\"related\":{\"urls\":[{\"urlName\":\"EURES portal\",\"urlValue\":\"https://ec.europa.eu/eures/eures-searchengine/page/main?lang=en#/fullscreenJvView?uuId=03a922c606754957ba0d7ec2f96714c3&jvId=462003&pesId=63\"}]},\"jobFacets\":[{\"facetName\":\"EURES_FLAG\",\"facetValue\":\"false\",\"facetDescription\":\"Without EURES flag\"},{\"facetName\":\"LOCATION\",\"facetValue\":\"BE1\",\"facetDescription\":\"RGION DE BRUXELLES-CAPITALE / BRUSSELS HOOFDSTEDELIJK GEWEST\"},{\"facetName\":\"OCCUPATION\",\"facetValue\":\"2151\",\"facetDescription\":\"Electrical engineers\"}]}]}}"))
            // TODO: Complete explicit tests, or "just" spot tests?
            .andExpect(jsonPath("$.header.disclaimer", is("I tillegg til de generelle vilkaarene angitt under lenken under brua, maa man ikke glemme Cartago")))
          ;
        } catch (Exception e) {
          throw new RuntimeException(e);
        }
    }

}