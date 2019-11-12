package no.nav.arbeid.euresapi.domain.legacy;

import java.util.ArrayList;
import java.util.List;

public class Item {
  
  private JobVacancyHeader jobVacancyHeader;
  
  private AuditInfo auditInfo;
  
  private JobRelevance jobRelevance;
  
  private CodeDescriptions codeDescriptions;
  
  private Related related;

  private List<JobFacet> jobFacets = new ArrayList<>();

  public Item() {
  }

  public Item(
      final JobVacancyHeader jobVacancyHeader,
      final AuditInfo    auditInfo,
      final JobRelevance  jobRelevance,
      final CodeDescriptions codeDescriptions,
      final Related    related,
      final List<JobFacet>  jobFacets
  ) {
    this.jobVacancyHeader = jobVacancyHeader;
    this.auditInfo = auditInfo;
    this.jobRelevance = jobRelevance;
    this.codeDescriptions = codeDescriptions;
    this.related = related;
    this.jobFacets = jobFacets;
  }

  public JobVacancyHeader getJobVacancyHeader() {
    return jobVacancyHeader;
  }

  public void setJobVacancyHeader(JobVacancyHeader jobVacancyHeader) {
    this.jobVacancyHeader = jobVacancyHeader;
  }

  public AuditInfo getAuditInfo() {
    return auditInfo;
  }

  public void setAuditInfo(AuditInfo auditInfo) {
    this.auditInfo = auditInfo;
  }

  public JobRelevance getJobRelevance() {
    return jobRelevance;
  }

  public void setJobRelevance(JobRelevance jobRelevance) {
    this.jobRelevance = jobRelevance;
  }

  public CodeDescriptions getCodeDescriptions() {
    return codeDescriptions;
  }

  public void setCodeDescriptions(CodeDescriptions codeDescriptions) {
    this.codeDescriptions = codeDescriptions;
  }

  public Related getRelated() {
    return related;
  }

  public void setRelated(Related related) {
    this.related = related;
  }

  public List<JobFacet> getJobFacets() {
    return jobFacets;
  }

  public void setJobFacets(List<JobFacet> jobFacets) {
    this.jobFacets = jobFacets;
  }

  @Override
  public String toString() {
    return "Item{" +
            ", jobVacancyHeader=" + jobVacancyHeader +
            ", auditInfo=" + auditInfo +
            ", jobRelevance=" + jobRelevance +
            ", codeDescriptions=" + codeDescriptions +
            ", related=" + related +
            ", jobFacets=" + jobFacets +
            '}';
  }
}