package no.nav.arbeid.euresapi.domain.eures;

public class Item2018 {

  private DataHeader2018 header;

  private AuditInfo2018 auditInfo;

  private JobRelevance2018 jobRelevance;

  private Related2018 related;

  public Item2018() {}

  public Item2018(
      final DataHeader2018 header,
      final AuditInfo2018 auditInfo,
      final JobRelevance2018 jobRelevance,
      final Related2018 related
  ) {
    this.header       = header;
    this.auditInfo    = auditInfo;
    this.jobRelevance = jobRelevance;
    this.related      = related;
  }

  public DataHeader2018 getHeader() {
    return header;
  }

  public void setHeader(DataHeader2018 header) {
    this.header = header;
  }

  public AuditInfo2018 getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(AuditInfo2018 auditInfo) {
    this.auditInfo = auditInfo;
  }

  public JobRelevance2018 getJobRelevance() {
    return jobRelevance;
  }

  public void setJobRelevance(JobRelevance2018 jobRelevance) {
    this.jobRelevance = jobRelevance;
  }

  public Related2018 getRelated() {
    return related;
  }

  public void setRelated(Related2018 related) {
    this.related = related;
  }

  @Override
  public String toString() {
    return "Item2018{" +
            ", header=" + header +
            ", auditInfo=" + auditInfo +
            ", jobRelevance=" + jobRelevance +
            ", related=" + related +
            '}';
  }
}