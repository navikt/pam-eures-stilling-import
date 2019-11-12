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

  private String euresUrlScheme;

  private String euresUrlHostName;

  private Integer euresUrlPort;

  private String euresUrlBasePath;

  private final static String SEARCH_SUFFIX = "jv/search";

  private final static String GET_DATAILS_SUFFIX = "jv/get";

  private final static String SOURCE_STATUS_SUFFIX = "sourceStatus";

  private final static String PING_SUFFIX = "ping";

  private final static String CODELISTS_SUFFIX = "jv/getCodeLists";

  @Autowired
  UriBuilder(
          @Value("${EuresUrlScheme}") String euresUrlScheme,
          @Value("${EuresUrlHostName}")  String euresUrlHostName,
          @Value("${EuresUrlPort}") Integer euresUrlPort,
          @Value("${EuresUrlBasePath}") String euresUrlBasePath
  ) {

    this.euresUrlScheme = euresUrlScheme;
    this.euresUrlHostName = euresUrlHostName;
    this.euresUrlPort = euresUrlPort;
    this.euresUrlBasePath = euresUrlBasePath;
  }

  URI sourceStatusUri() {
    return build(SOURCE_STATUS_SUFFIX);
  }

  URI codeListsUri() {
    return build(CODELISTS_SUFFIX);
  }

  URI adDetailsUri() {
    return build(GET_DATAILS_SUFFIX);
  }

  URI searchUri() {
    return build(SEARCH_SUFFIX);
  }

  URI pingUri() {
    return build(PING_SUFFIX);
  }

  private URI build(final String euresUrlServicePath) {

    Objects.requireNonNull(euresUrlServicePath, "Parameter euresUrlServicePath is null");

    final String urlPath = euresUrlBasePath + euresUrlServicePath;

    try {

      return new URI(euresUrlScheme, null, euresUrlHostName, euresUrlPort, urlPath, null, null);
    } catch (URISyntaxException e) {
      LOGGER.error("Exception received when trying to create a new URI.");
      throw new RuntimeException(e);
    }

  }

}