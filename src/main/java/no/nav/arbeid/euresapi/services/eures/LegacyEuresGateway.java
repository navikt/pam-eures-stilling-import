package no.nav.arbeid.euresapi.services.eures;

import no.nav.arbeid.euresapi.domain.legacy.GetCodeListsReply;
import no.nav.arbeid.euresapi.domain.legacy.SourceStatusReply;
import no.nav.arbeid.euresapi.search.SearchJobsRequestPropertiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class LegacyEuresGateway extends EuresGateway {


    private final RestTemplate restTemplate;

    private final UriBuilder uriBuilder;

    @Autowired
    LegacyEuresGateway(
            SearchJobsRequestPropertiesRepository searchJobsRequestPropertyFileRepository,
            RestTemplate restTemplate,
            UriBuilder uriBuilder) {
        super(searchJobsRequestPropertyFileRepository, restTemplate, uriBuilder);
        this.restTemplate = restTemplate;
        this.uriBuilder = uriBuilder;
    }

    public GetCodeListsReply getCodeLists() {

        final MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("\"Accept-Language\"", "No");

        final HttpEntity<Object> requestEntity = new HttpEntity<>(null, headers);

        return restTemplate.exchange(uriBuilder.codeListsUri(), HttpMethod.GET, requestEntity, GetCodeListsReply.class)
                .getBody();
    }


    /**
     * Returns the status of the databases in which EURES searches for job vacancies.
     */
    public SourceStatusReply sourceStatus() {

        final HttpEntity<Object> requestEntity = new HttpEntity<>(null, acceptNorwegianLanguageOnlyHeaders());

        return restTemplate.exchange(uriBuilder.sourceStatusUri(), HttpMethod.GET, requestEntity, SourceStatusReply.class)
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


}