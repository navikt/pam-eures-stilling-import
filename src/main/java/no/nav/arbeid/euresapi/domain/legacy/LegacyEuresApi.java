package no.nav.arbeid.euresapi.domain.legacy;

import no.nav.arbeid.euresapi.domain.eures.EuresApi;
import no.nav.arbeid.euresapi.domain.eures.GetReply2018;
import no.nav.arbeid.euresapi.domain.legacy.converter.ToLegacyConverter;
import no.nav.arbeid.euresapi.services.eures.LegacyEuresGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LegacyEuresApi {

    private final EuresApi euresApi;

    private LegacyEuresGateway euresGateway;

    private ToLegacyConverter legacyConverter;

    @Autowired
    public LegacyEuresApi(
            EuresApi euresApi,
            LegacyEuresGateway euresGateway,
            ToLegacyConverter legacyConverter) {
        this.euresApi = euresApi;
        this.euresGateway = euresGateway;
        this.legacyConverter = legacyConverter;
    }

    public SearchJobsReply searchJobs() {

        final GetReply2018 getReply = euresApi.searchJobs();

        return legacyConverter.convert(getReply);
    }

    public GetCodeListsReply getCodeLists() {

        return euresGateway.getCodeLists();
    }

    public SourceStatusReply sourceStatus() {

        return euresGateway.sourceStatus();
    }

    public HttpStatus ping() {

        return euresGateway.ping();
    }

}
