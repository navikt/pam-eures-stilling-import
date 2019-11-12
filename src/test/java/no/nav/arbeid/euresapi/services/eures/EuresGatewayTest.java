package no.nav.arbeid.euresapi.services.eures;

import ch.qos.logback.classic.Logger;
import com.fasterxml.jackson.core.JsonProcessingException;
import no.nav.arbeid.euresapi.EuresApiApplication;
import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReply;
import no.nav.arbeid.euresapi.domain.legacy.SourceStatusReply;
import no.nav.arbeid.euresapi.domain.eures.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.aop.TargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by r149852 on 15.06.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={EuresApiApplication.class})
public class EuresGatewayTest {

    /**
     * TODO: Candidate for general utilities
     * See <a href="https://www.thekua.com/atwork/2011/06/finding-real-object-under-spring-proxies/"></a>
     */
    public static class CglibHelper {
        private final Object proxied;

        CglibHelper(Object proxied) {
            this.proxied = proxied;
        }

        Object getTargetObject() {
            String name = proxied.getClass().getName();
            if (name.toLowerCase().contains("cglib")) {
                return extractTargetObject(proxied);
            }
            return proxied;
        }

        private Object extractTargetObject(Object proxied) {
            try {
                return findSpringTargetSource(proxied).getTarget();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private TargetSource findSpringTargetSource(Object proxied) {
            Method[] methods = proxied.getClass().getDeclaredMethods();
            Method targetSourceMethod = findTargetSourceMethod(methods);
            targetSourceMethod.setAccessible(true);
            try {
                return (TargetSource)targetSourceMethod.invoke(proxied);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        private Method findTargetSourceMethod(Method[] methods) {
            for (Method method : methods) {
                if (method.getName().endsWith("getTargetSource")) {
                    return method;
                }
            }
            throw new IllegalStateException(
              "Could not find target source method on proxied object ["
                + proxied.getClass() + "]");
        }
    }

    private static final Logger logger =
        (Logger)LoggerFactory.getLogger(EuresGatewayTest.class);

    private static final Logger enteringTestHeaderLogger =
        (Logger)LoggerFactory.getLogger("EnteringTestHeader");

    @MockBean
    private UriBuilder uriBuilder;

    @MockBean
    private RestTemplate restTemplate;

    @Autowired
    private LegacyEuresGateway euresGateway;

    private LegacyEuresGateway getEuresGateway() {
        return euresGateway;
    }

    // ==========================================================================

    @Test
    public void testSearch() throws URISyntaxException {

        enteringTestHeaderLogger.debug(null);

        // TODO: Make a builder to get a more sensible response
        final SearchReply2018 expectedSearchReply = Search2018Utils.getSearchReply2018_001();
        final GetReply2018 getReply2018 = new GetReply2018();

        // =====================================================================
        when(
            this.restTemplate.exchange(
                  any(URI.class)
                , any(HttpMethod.class)
                , any(HttpEntity.class)
                , any(Class.class))
        )
        .thenReturn(new ResponseEntity<>(expectedSearchReply, HttpStatus.OK))
        .thenReturn(new ResponseEntity<>(getReply2018, HttpStatus.OK));
        // =====================================================================
        when(this.uriBuilder.searchUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
        when(this.uriBuilder.adDetailsUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
        // =====================================================================

      GetReply2018 searchReply = this.euresGateway.searchJobs();
        // TODO: What about some more comparisons???!!
        assertNotNull(searchReply);
    }

  // ==========================================================================

  @Test
  public void testGet() throws URISyntaxException {

    enteringTestHeaderLogger.debug(null);

    // TODO: Make a builder to get a more sensible response
    final GetReply2018 expectedGetReply =
      Get2018Utils.getGetReply2018_LIGHT_001();

    // =====================================================================
    when(
      this.restTemplate.exchange(
        any(URI.class)
        , any(HttpMethod.class)
        , any(HttpEntity.class)
        , any(Class.class))
    )
      .thenReturn(new ResponseEntity<>(expectedGetReply, HttpStatus.OK));
    // =====================================================================
    when(this.uriBuilder.adDetailsUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
    // =====================================================================
    final GetRequest2018 getRequest2018 = new GetRequest2018();
    final GetReply2018 getReply = this.euresGateway.get(getRequest2018);
    // TODO: What about some more comparisons???!!
    assertNotNull(getReply);
  }

  // ==========================================================================

  @Test
  public void testSearchJobs() {
    enteringTestHeaderLogger.debug(null);
  }

  // ==========================================================================

    @Test
    public void testSourceStatus() throws URISyntaxException {

        enteringTestHeaderLogger.debug(null);

        // TODO: Make a builder to get a more sensible response
        final SourceStatusReply expectedSourceStatusReply =
            new SourceStatusReply();
        // =====================================================================
        when(
            this.restTemplate.exchange(
                  any(URI.class)
                , any(HttpMethod.class)
                , any(HttpEntity.class)
                , any(Class.class))
        )
        .thenReturn(new ResponseEntity<>(expectedSourceStatusReply, HttpStatus.OK));
        // =====================================================================
        when(this.uriBuilder.sourceStatusUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
        // =====================================================================

        final SourceStatusReply actualSourceStatusReply = this.euresGateway.sourceStatus();
        // TODO: What about some more comparisons???!!
        assertNotNull(actualSourceStatusReply);
    }

  // ==========================================================================

    @Test
    public void testGetCodeLists() throws URISyntaxException {

        enteringTestHeaderLogger.debug(null);

        // TODO: Make a builder to get a more sensible response
        final GetCodeListsReply expectedGetCodeListsReply =
            new GetCodeListsReply();
        // =====================================================================
        when(
            this.restTemplate.exchange(
                  any(URI.class)
                , any(HttpMethod.class)
                , any(HttpEntity.class)
                , any(Class.class))
        )
        .thenReturn(new ResponseEntity<>(expectedGetCodeListsReply, HttpStatus.OK));
        // =====================================================================
        when(this.uriBuilder.codeListsUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
        // =====================================================================

        final GetCodeListsReply actualGetCodeListsReply = this.euresGateway.getCodeLists();
        // TODO: What about some more comparisons???!!
        assertNotNull(actualGetCodeListsReply);
    }

  // ==========================================================================

  /**
   * Checks that ping does not crash
   * @throws IllegalAccessException
   * @throws JsonProcessingException
   * @throws URISyntaxException
   */
  @Test
  public void testPingWithJsonProcessingException() throws IllegalAccessException, URISyntaxException {

    enteringTestHeaderLogger.debug(null);

    // =====================================================================
    when(
      this.restTemplate.exchange(
        any(URI.class)
        , any(HttpMethod.class)
        , any(HttpEntity.class)
        , any(Class.class))
    )
      .thenReturn(new ResponseEntity<>(new Object(), HttpStatus.OK));
    // =====================================================================
    when(this.uriBuilder.pingUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
    // =====================================================================
    euresGateway.ping();
  }

    @Test
    public void testPing() throws IllegalAccessException, JsonProcessingException, URISyntaxException {

        enteringTestHeaderLogger.debug(null);

        // =====================================================================
        when(
            this.restTemplate.exchange(
                  any(URI.class)
                , any(HttpMethod.class)
                , any(HttpEntity.class)
                , any(Class.class))
        )
        .thenReturn(new ResponseEntity<>(new Object(), HttpStatus.OK));
        // =====================================================================
        when(this.uriBuilder.pingUri()).thenReturn(new URI("A_malformed_meaningless_and_useless_URL_just_for_testing_placeholder_purpose"));
        // =====================================================================

        final HttpStatus httpStatus = this.euresGateway.ping();
        assertEquals(HttpStatus.OK, httpStatus);
    }



  // ==========================================================================

    /**
     * Actually testing the getGetRequest method.
     */
    @Test
    public void when_a_request_is_created_from_a_search_reply_then_the_view_field_should_implicitly_be_set_to_the_correct_value() {

        enteringTestHeaderLogger.debug(null);

        final SearchReply2018 searchReply = Search2018Utils.getSearchReply2018_001();
        final GetRequest2018 getGetRequest = this.euresGateway.getGetRequest(searchReply);

        assertThat(getGetRequest).isNotNull();
        assertThat(getGetRequest.getView()).isEqualTo(View2018.ViewValue.FULL.name());
    }

  @Test
  public void when_a_request_is_created_from_a_search_reply_then_all_the_handles_should_be_included() {

    enteringTestHeaderLogger.debug(null);

    final SearchReply2018 searchReply = Search2018Utils.getSearchReply2018_001();
    final Collection<String> expectedHandles =
      searchReply
        .getData()
        .getItems()
        .stream()
        .map((final Item2018 item) -> (item).getHeader().getHandle())
        .collect(Collectors.toList());

    final GetRequest2018 getRequest = this.euresGateway.getGetRequest(searchReply);
    final Collection<String> actualHandles = getRequest.getHandles();

    assertThat(actualHandles).isNotNull();
    assertThat(actualHandles.size()).isEqualTo(expectedHandles.size());
    assertThat(actualHandles.containsAll(expectedHandles));
    assertThat(expectedHandles.containsAll(actualHandles));
  }
}