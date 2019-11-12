package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.annotation.JsonProperty;
import no.nav.arbeid.euresapi.domain.request.SearchJobsRequest;

public class Parameters2018 {

  @JsonProperty("request")
  private SearchJobsRequest searchJobsRequest;

  private String      acceptLanguageHeader;

  public Parameters2018() {
  }

  Parameters2018(
      final SearchJobsRequest searchJobsRequest,
      final String            acceptLanguageHeader
  ) {
    this.searchJobsRequest    = searchJobsRequest;
    this.acceptLanguageHeader = acceptLanguageHeader;
  }

  public SearchJobsRequest getSearchJobsRequest() {
    return searchJobsRequest;
  }

  public void setSearchJobsRequest(SearchJobsRequest searchJobsRequest) {
    this.searchJobsRequest = searchJobsRequest;
  }

  public String getAcceptLanguageHeader() {
    return acceptLanguageHeader;
  }

  public void setAcceptLanguageHeader(String acceptLanguageHeader) {
    this.acceptLanguageHeader = acceptLanguageHeader;
  }
}