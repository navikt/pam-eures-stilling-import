package no.nav.arbeid.euresapi.domain.legacy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobVacancyHeader {

  private String jobVacancyHandle;
  private Integer dataSourceId;
  private String dataSourceName;
  @JsonProperty("dataSourceUniqueJVId")
  private String dataSourceUniqueJvId;
  private String title;
  private String jobDescription;
  private Integer posts;
  private String employerName;
  private String salaryCurrencyCode;
  private Double maximalSalary;
  private Double minimalSalary;
  private String salaryPeriodCode;
  private String salaryTaxationCode;
  private String lastApplicationDate;
  private String endDate;
  private String startDate;

  public JobVacancyHeader() {}
  public JobVacancyHeader(
      final String   jobVacancyHandle,
      final Integer  dataSourceId,
      final String   dataSourceName,
      final String   dataSourceUniqueJvId,
      final String   title,
      final String   jobDescription,
      final Integer  posts,
      final String   employerName,
      final String   salaryCurrencyCode,
      final Double   maximalSalary,
      final Double   minimalSalary,
      final String   salaryPeriodCode,
      final String   salaryTaxationCode,
      final String   lastApplicationDate,
      final String   endDate,
      final String   startDate
  ) {

    this.jobVacancyHandle     = jobVacancyHandle;
    this.dataSourceId         = dataSourceId;
    this.dataSourceName       = dataSourceName;
    this.dataSourceUniqueJvId = dataSourceUniqueJvId;
    this.title                = title;
    this.jobDescription       = jobDescription;
    this.posts                = posts;
    this.employerName         = employerName;
    this.salaryCurrencyCode   = salaryCurrencyCode;
    this.maximalSalary        = maximalSalary;
    this.minimalSalary        = minimalSalary;
    this.salaryPeriodCode     = salaryPeriodCode;
    this.salaryTaxationCode   = salaryTaxationCode;
    this.lastApplicationDate  = lastApplicationDate;
    this.endDate              = endDate;
    this.startDate            = startDate;
  }

  public String getJobVacancyHandle() {
    return jobVacancyHandle;
  }

  public void setJobVacancyHandle(String jobVacancyHandle) {
    this.jobVacancyHandle = jobVacancyHandle;
  }

  public Integer getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }

  public String getDataSourceName() {
    return dataSourceName;
  }

  public void setDataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }

  public String getDataSourceUniqueJvId() {
    return dataSourceUniqueJvId;
  }

  public void setDataSourceUniqueJvId(String dataSourceUniqueJvId) {
    this.dataSourceUniqueJvId = dataSourceUniqueJvId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
  }

  public Integer getPosts() {
    return posts;
  }

  public void setPosts(Integer posts) {
    this.posts = posts;
  }

  public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employerName) {
    this.employerName = employerName;
  }

  public String getSalaryCurrencyCode() {
    return salaryCurrencyCode;
  }

  public void setSalaryCurrencyCode(String salaryCurrencyCode) {
    this.salaryCurrencyCode = salaryCurrencyCode;
  }

  public Double getMaximalSalary() {
    return maximalSalary;
  }

  public void setMaximalSalary(Double maximalSalary) {
    this.maximalSalary = maximalSalary;
  }

  public Double getMinimalSalary() {
    return minimalSalary;
  }

  public void setMinimalSalary(Double minimalSalary) {
    this.minimalSalary = minimalSalary;
  }

  public String getSalaryPeriodCode() {
    return salaryPeriodCode;
  }

  public void setSalaryPeriodCode(String salaryPeriodCode) {
    this.salaryPeriodCode = salaryPeriodCode;
  }

  public String getSalaryTaxationCode() {
    return salaryTaxationCode;
  }

  public void setSalaryTaxationCode(String salaryTaxationCode) {
    this.salaryTaxationCode = salaryTaxationCode;
  }

  public String getLastApplicationDate() {
    return lastApplicationDate;
  }

  public void setLastApplicationDate(String lastApplicationDate) {
    this.lastApplicationDate = lastApplicationDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  @Override
  public String toString() {
    return "JobVacancyHeader{" +
            ", jobVacancyHandle='" + jobVacancyHandle + '\'' +
            ", dataSourceId=" + dataSourceId +
            ", dataSourceName='" + dataSourceName + '\'' +
            ", dataSourceUniqueJvId='" + dataSourceUniqueJvId + '\'' +
            ", title='" + title + '\'' +
            ", jobDescription='" + jobDescription + '\'' +
            ", posts=" + posts +
            ", employerName='" + employerName + '\'' +
            ", salaryCurrencyCode='" + salaryCurrencyCode + '\'' +
            ", maximalSalary=" + maximalSalary +
            ", minimalSalary=" + minimalSalary +
            ", salaryPeriodCode='" + salaryPeriodCode + '\'' +
            ", salaryTaxationCode='" + salaryTaxationCode + '\'' +
            ", lastApplicationDate='" + lastApplicationDate + '\'' +
            ", endDate='" + endDate + '\'' +
            ", startDate='" + startDate + '\'' +
            '}';
  }
}