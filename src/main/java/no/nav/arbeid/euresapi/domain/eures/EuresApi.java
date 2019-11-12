package no.nav.arbeid.euresapi.domain.eures;

import no.nav.arbeid.euresapi.services.eures.EuresGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class EuresApi {

    private EuresGateway euresGateway;

    @Autowired
    public EuresApi(EuresGateway euresGateway) {
        this.euresGateway = euresGateway;
    }

    public String searchJobs2() {

        return euresGateway.searchJobs2();

    }

    public GetReply2018 searchJobs() {

        return euresGateway.searchJobs();

    }

    public HttpStatus ping() {

        return euresGateway.ping();
    }

}

