package no.nav.arbeid.euresapi.services.eures;

import no.nav.arbeid.euresapi.domain.eures.GetReply2018;
import no.nav.arbeid.euresapi.domain.eures.GetRequest2018;
import no.nav.arbeid.euresapi.domain.eures.SearchReply2018;
import no.nav.arbeid.euresapi.domain.eures.View2018;
import no.nav.arbeid.euresapi.domain.request.SearchJobsRequest;
import no.nav.arbeid.euresapi.search.SearchJobsRequestPropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class EuresGateway {

    private final SearchJobsRequestPropertiesRepository searchJobsRequestPropertyFileRepository;

    private final RestTemplate restTemplate;

    private final UriBuilder uriBuilder;

    @Autowired
    EuresGateway(
            SearchJobsRequestPropertiesRepository searchJobsRequestPropertyFileRepository,
            RestTemplate restTemplate,
            UriBuilder uriBuilder) {
        this.searchJobsRequestPropertyFileRepository = searchJobsRequestPropertyFileRepository;
        this.restTemplate = restTemplate;
        this.uriBuilder = uriBuilder;
    }

    public HttpStatus ping() {

        final HttpEntity<Object> requestEntity = new HttpEntity<>(null, headers());

        return restTemplate.exchange(uriBuilder.pingUri(), HttpMethod.GET, requestEntity, Object.class)
                .getStatusCode();
    }

    /**
     * Calls the EURES REST service "Search", and fetches the details for all results
     */
    public GetReply2018 searchJobs() {

        final SearchJobsRequest searchJobsRequest = getSearchJobsRequest();

        final SearchReply2018 searchReply = search(searchJobsRequest);

        final GetRequest2018 getRequest = getGetRequest(searchReply);

        return get(getRequest);
    }
    /**
     * Calls the EURES REST service "Search", and fetches the details for all results
     */
    public String searchJobs2() {

        final SearchJobsRequest searchJobsRequest = getSearchJobsRequest();

        return get2(getGetRequest2());
//        return search2(searchJobsRequest);

    }

    /**
     * Fetches metadata for all ads matching the given criteria
     */
    private SearchReply2018 search(final SearchJobsRequest searchJobsRequest) {

        final HttpEntity<SearchJobsRequest> requestEntity = new HttpEntity<>(searchJobsRequest, headers());

        return restTemplate.exchange(uriBuilder.searchUri(), HttpMethod.POST, requestEntity, SearchReply2018.class)
                .getBody();
    }
    /**
     * Fetches metadata for all ads matching the given criteria
     */
    private String search2(final SearchJobsRequest searchJobsRequest) {

        final HttpEntity<SearchJobsRequest> requestEntity = new HttpEntity<>(searchJobsRequest, headers());
        return restTemplate.postForEntity(uriBuilder.searchUri(), requestEntity, String.class).getBody();
    }


    String get2(final GetRequest2018 getRequest) {

        final HttpEntity<GetRequest2018> requestEntity = new HttpEntity<>(getRequest, acceptNorwegianLanguageOnlyHeaders());

        return restTemplate.postForEntity(uriBuilder.adDetailsUri(), requestEntity, String.class)
                .getBody();
    }

    GetReply2018 get(final GetRequest2018 getRequest) {

        final HttpEntity<GetRequest2018> requestEntity = new HttpEntity<>(getRequest, acceptNorwegianLanguageOnlyHeaders());

        return restTemplate.exchange(uriBuilder.adDetailsUri(), HttpMethod.POST, requestEntity, GetReply2018.class)
                .getBody();
    }


    private MultiValueMap<String, String> headers() {
        final MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();

        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json;charset=utf8");

        return headers;
    }

    private MultiValueMap<String, String> acceptNorwegianLanguageOnlyHeaders() {
        final MultiValueMap<String, String> headers = headers();
        headers.add("\"Accept-Language\"", "No");
        return headers;

    }

    /**
     * Reads the preconfigured search
     * criteria and returns them as an
     * instance of {@link SearchJobsRequest}
     * This method takes care of the way the preconfigured
     * criteria are represented.
     *
     * @return An instance of {@link SearchJobsRequest}
     */
    public SearchJobsRequest getSearchJobsRequest() {

        return searchJobsRequestPropertyFileRepository.getPredefinedSearchJobsRequest();
    }

    /**
     * Create request for details of a list of ads found represented by the reply
     */
    GetRequest2018 getGetRequest2() {

        final GetRequest2018 getRequest = new GetRequest2018();
        getRequest.getHandles().add("MjMwMjYgMTIx");
        getRequest.getHandles().add("ODkyMDQ2IDEyMQ");

        getRequest.setView(View2018.ViewValue.FULL.name());
        return getRequest;
    }

    /**
     * Create request for details of a list of ads found represented by the reply
     */
    GetRequest2018 getGetRequest(final SearchReply2018 searchReply2018) {

        final GetRequest2018 getRequest = new GetRequest2018();

        searchReply2018
                .getData()
                .getItems()
                .forEach(
                        (item) -> getRequest.getHandles().add(item.getHeader().getHandle())
                );

        getRequest.setView(View2018.ViewValue.FULL.name());
        return getRequest;
    }


}