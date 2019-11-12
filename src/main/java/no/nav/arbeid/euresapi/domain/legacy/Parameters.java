package no.nav.arbeid.euresapi.domain.legacy;

import no.nav.arbeid.euresapi.domain.request.SearchJobsRequest;

public class Parameters {

  private SearchJobsRequest searchJobsRequest;

  private String      acceptLanguageHeader;

  public Parameters() {
  }

  public Parameters(
      final SearchJobsRequest searchJobsRequest,
      final String acceptLanguageHeader
  ) {
    this.searchJobsRequest  = searchJobsRequest;
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

  @Override
  public String toString() {
    return "Parameters{" +
            ", searchJobsRequest=" + searchJobsRequest +
            ", acceptLanguageHeader='" + acceptLanguageHeader + '\'' +
            '}';
  }
}