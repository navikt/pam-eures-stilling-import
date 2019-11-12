package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetReplyItem2018 {

  @JsonProperty("jobVacancy")
  private GetReplyJobVacancy2018 getReplyJobVacancy;

  @JsonProperty("auditInfo")
  private GetReplyAuditInfo2018 getReplyAuditInfo;

  @JsonProperty("related")
  private GetReplyRelated2018 getReplyRelated;

  public GetReplyItem2018() {
  }

  public GetReplyItem2018(
      final GetReplyJobVacancy2018 getReplyJobVacancy,
      final GetReplyAuditInfo2018  getReplyAuditInfo,
      final GetReplyRelated2018    getReplyRelated
  ) {
    this.getReplyJobVacancy = getReplyJobVacancy;
    this.getReplyAuditInfo = getReplyAuditInfo;
    this.getReplyRelated = getReplyRelated;
  }


  public GetReplyJobVacancy2018 getGetReplyJobVacancy() {
    return getReplyJobVacancy;
  }

  public void setGetReplyJobVacancy(GetReplyJobVacancy2018 getReplyJobVacancy) {
    this.getReplyJobVacancy = getReplyJobVacancy;
  }

  public GetReplyAuditInfo2018 getGetReplyAuditInfo() {
    return getReplyAuditInfo;
  }

  public void setGetReplyAuditInfo(GetReplyAuditInfo2018 getReplyAuditInfo) {
    this.getReplyAuditInfo = getReplyAuditInfo;
  }

  public GetReplyRelated2018 getGetReplyRelated() {
    return getReplyRelated;
  }

  public void setGetReplyRelated(GetReplyRelated2018 getReplyRelated) {
    this.getReplyRelated = getReplyRelated;
  }

  @Override
  public String toString() {
    return "GetReplyItem2018{" +
            ", getReplyJobVacancy=" + getReplyJobVacancy +
            ", getReplyAuditInfo=" + getReplyAuditInfo +
            ", getReplyRelated=" + getReplyRelated +
            '}';
  }
}