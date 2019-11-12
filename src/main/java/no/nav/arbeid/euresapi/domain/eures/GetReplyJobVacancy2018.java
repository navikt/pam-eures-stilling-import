package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetReplyJobVacancy2018 {

  @JsonProperty("header")
  private GetReplyJobVacancyHeader2018 getReplyJobVacancyHeader;

  private String hrxml;

  public GetReplyJobVacancy2018() {
  }

  public GetReplyJobVacancy2018(GetReplyJobVacancyHeader2018 getReplyJobVacancyHeader, String hrxml) {
    this.getReplyJobVacancyHeader = getReplyJobVacancyHeader;
    this.hrxml = hrxml;
  }

  public GetReplyJobVacancyHeader2018 getGetReplyJobVacancyHeader() {
    return getReplyJobVacancyHeader;
  }

  public void setGetReplyJobVacancyHeader(GetReplyJobVacancyHeader2018 getReplyJobVacancyHeader) {
    this.getReplyJobVacancyHeader = getReplyJobVacancyHeader;
  }

  public String getHrxml() {
    return hrxml;
  }

  public void setHrxml(String hrxml) {
    this.hrxml = hrxml;
  }

  @Override
  public String toString() {
    return "GetReplyJobVacancy2018{" +
            ", getReplyJobVacancyHeader=" + getReplyJobVacancyHeader +
            ", hrxml='" + hrxml + '\'' +
            '}';
  }
}