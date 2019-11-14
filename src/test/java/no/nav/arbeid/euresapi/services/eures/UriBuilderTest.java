package no.nav.arbeid.euresapi.services.eures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UriBuilderTest {

    private static final String ROOT = "https://ec.europa.eu:443/eures/output/api/v1/";

    private UriBuilder uriBuilder = new UriBuilder();


    @Test
    public void sourceStatusUri() {
        assertEquals(ROOT + "sourceStatus", uriBuilder.sourceStatusUri());
    }

    @Test
    public void codeListsUri() {
        assertEquals(ROOT + "jv/getCodeLists", uriBuilder.codeListsUri());
    }

    @Test
    public void adDetailsUri() {
        assertEquals(ROOT + "jv/get", uriBuilder.adDetailsUri());
    }

    @Test
    public void searchUri() {
        assertEquals(ROOT + "jv/search", uriBuilder.searchUri());
    }

    @Test
    public void pingUri() {
        assertEquals(ROOT + "ping", uriBuilder.pingUri());
    }

}