package no.nav.arbeid.euresapi.services.eures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UriBuilderTest {

    private static final String SCHEME = "https";
    private static final String HOST = "ec.europa.eu";
    private static final Integer PORT = 80;
    private static final String CONTEXT = "/eures/output/api/v1/";

    private static final String ROOT = "https://ec.europa.eu:80/eures/output/api/v1/";

    private UriBuilder uriBuilder = new UriBuilder(SCHEME, HOST, PORT, CONTEXT);


    @Test
    public void sourceStatusUri() {
        assertEquals(ROOT + "sourceStatus", uriBuilder.sourceStatusUri().toString());
    }

    @Test
    public void codeListsUri() {
        assertEquals(ROOT + "jv/getCodeLists", uriBuilder.codeListsUri().toString());
    }

    @Test
    public void adDetailsUri() {
        assertEquals(ROOT + "jv/get", uriBuilder.adDetailsUri().toString());
    }

    @Test
    public void searchUri() {
        assertEquals(ROOT + "jv/search", uriBuilder.searchUri().toString());
    }

    @Test
    public void pingUri() {
        assertEquals(ROOT + "ping", uriBuilder.pingUri().toString());
    }

}