package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetReplyParameters2018 {

  @JsonProperty("request")
  private GetRequest2018 getRequest2018;

  private String acceptLanguageHeader;

  public GetReplyParameters2018() {
  }

  public GetReplyParameters2018(
      final GetRequest2018 getRequest2018,
      final String acceptLanguageHeader
  ) {
    this.getRequest2018 = getRequest2018;
    this.acceptLanguageHeader = acceptLanguageHeader;
  }

  public GetRequest2018 getGetRequest2018() {
    return getRequest2018;
  }

  public void setGetRequest2018(GetRequest2018 getRequest2018) {
    this.getRequest2018 = getRequest2018;
  }

  public String getAcceptLanguageHeader() {
    return acceptLanguageHeader;
  }

  public void setAcceptLanguageHeader(String acceptLanguageHeader) {
    this.acceptLanguageHeader = acceptLanguageHeader;
  }

  @Override
  public String toString() {
    return "GetReplyParameters2018{" +
            ", getRequest2018=" + getRequest2018 +
            ", acceptLanguageHeader='" + acceptLanguageHeader + '\'' +
            '}';
  }
}