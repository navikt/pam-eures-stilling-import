package no.nav.arbeid.euresapi.services.eures;

import ch.qos.logback.classic.Logger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
class UriBuilder {

  private static final Logger LOGGER =
      (Logger) LoggerFactory.getLogger(UriBuilder.class);

  private static final String root = "https://ec.europa.eu:443/eures/output/api/v1/";

  private final static String SEARCH_SUFFIX = "jv/search";

  private final static String GET_DATAILS_SUFFIX = "jv/get";

  private final static String SOURCE_STATUS_SUFFIX = "sourceStatus";

  private final static String PING_SUFFIX = "ping";

  private final static String CODELISTS_SUFFIX = "jv/getCodeLists";

  String sourceStatusUri() {
    return build(SOURCE_STATUS_SUFFIX);
  }

  String codeListsUri() {
    return build(CODELISTS_SUFFIX);
  }

  String adDetailsUri() {
    return build(GET_DATAILS_SUFFIX);
  }

  String searchUri() {
    return build(SEARCH_SUFFIX);
  }

  String pingUri() {
    return build(PING_SUFFIX);
  }

  private String build(final String euresUrlServicePath) {

    Objects.requireNonNull(euresUrlServicePath, "Parameter euresUrlServicePath is null");

    return root + euresUrlServicePath;

  }

}