package no.nav.arbeid.euresapi.services.euresapi;

import ch.qos.logback.classic.Logger;
import no.nav.arbeid.euresapi.domain.eures.EuresApi;
import no.nav.arbeid.euresapi.domain.eures.Get2018Utils;
import no.nav.arbeid.euresapi.domain.legacy.*;
import no.nav.arbeid.euresapi.domain.legacy.converter.ToLegacyConverter;
import no.nav.arbeid.euresapi.services.eures.LegacyEuresGateway;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

/**
 * Created by r149852 on 20.06.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LegacyEuresApiTest {

    private static final Logger enteringTestHeaderLogger =
        (Logger)LoggerFactory.getLogger("EnteringTestHeader");

    @MockBean
    private LegacyEuresGateway mockedEuresGateway;

    @Autowired
    private LegacyEuresApi euresApiService;

    @Test
    public void testPing() {

        enteringTestHeaderLogger.debug(null);

        when(
            this.mockedEuresGateway.ping()
        )
        .thenReturn(HttpStatus.OK);

        final HttpStatus httpStatus = euresApiService.ping();
        assertEquals(HttpStatus.OK, httpStatus);
    }

    /**
     * TODO: Too much mocking here. Try to let Spring do more of its job using its test framework context loading functionality.
     */
    @Test
    public void testSearchJobs() {

        enteringTestHeaderLogger.debug(null);

        ToLegacyConverter toLegacyConverter = new ToLegacyConverter(mockedEuresGateway);
        // ---------------------------------------------------------------------
        final EuresApi euresApi = new EuresApi(mockedEuresGateway);

        final LegacyEuresApi mockedEuresApiService = new LegacyEuresApi(euresApi, mockedEuresGateway, toLegacyConverter);
        doReturn(Get2018Utils.getGetReply2018_FULL_001())
          .when(mockedEuresGateway)
          .searchJobs();

        doReturn(GetCodeListsReplyUtils.getGetCodeListsReplyUtils_001())
          .when(mockedEuresGateway)
          .getCodeLists();
        // ---------------------------------------------------------------------
        final SearchJobsReply actualSearchJobsReply = mockedEuresApiService.searchJobs();

        assertNotNull(actualSearchJobsReply);
        assertNotNull(actualSearchJobsReply.getData());
        assertNotNull(actualSearchJobsReply.getData().getItems());
        assertEquals(Get2018Utils.getGetReply2018_FULL_001().getData().getItems().size(), actualSearchJobsReply.getData().getItems().size());
        assertNull(actualSearchJobsReply.getHeader());  // Because the marshaller doesn't care about this presumably unused element.

        // TODO: What about some comparison testing????!!!!
    }

    @Test
    public void testGetCodeLists() {

        enteringTestHeaderLogger.debug(null);

        when(
            this.euresApiService.getCodeLists()
        )
        // TODO: Some more sensible return data, perhaps???!!
        .thenReturn(new GetCodeListsReply());

        euresApiService.getCodeLists();
        // TODO: What about some comparison testing????!!!!
    }

    @Test
    public void testSourceStatus() {

        enteringTestHeaderLogger.debug(null);

        when(
            this.euresApiService.sourceStatus()
        )
        // TODO: Some more sensible return data, perhaps???!!
        .thenReturn(new SourceStatusReply());

        euresApiService.sourceStatus();
        // TODO: What about some comparison testing????!!!!
    }
}