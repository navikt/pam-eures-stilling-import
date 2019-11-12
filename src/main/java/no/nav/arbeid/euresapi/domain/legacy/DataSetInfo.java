package no.nav.arbeid.euresapi.domain.legacy;

public class DataSetInfo {

  private String sortBy;

  private Integer pageNumber;

  private Integer resultsPerPage;

  private Integer totalPageCount;

  private Integer totalMatchingJobVacanciesCount;

  public DataSetInfo() {
  }

  public DataSetInfo(
      final String sortBy,
      final Integer pageNumber,
      final Integer resultsPerPage,
      final Integer totalPageCount,
      final Integer totalMatchingJobVacanciesCount
  ) {
    this.sortBy = sortBy;
    this.pageNumber = pageNumber;
    this.resultsPerPage = resultsPerPage;
    this.totalPageCount = totalPageCount;
    this.totalMatchingJobVacanciesCount = totalMatchingJobVacanciesCount;
  }

  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public Integer getResultsPerPage() {
    return resultsPerPage;
  }

  public void setResultsPerPage(Integer resultsPerPage) {
    this.resultsPerPage = resultsPerPage;
  }

  public Integer getTotalPageCount() {
    return totalPageCount;
  }

  public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
  }

  public Integer getTotalMatchingJobVacanciesCount() {
    return totalMatchingJobVacanciesCount;
  }

  public void setTotalMatchingJobVacanciesCount(Integer totalMatchingJobVacanciesCount) {
    this.totalMatchingJobVacanciesCount = totalMatchingJobVacanciesCount;
  }

  @Override
  public String toString() {
    return "DataSetInfo{" +
            ", sortBy='" + sortBy + '\'' +
            ", pageNumber=" + pageNumber +
            ", resultsPerPage=" + resultsPerPage +
            ", totalPageCount=" + totalPageCount +
            ", totalMatchingJobVacanciesCount=" + totalMatchingJobVacanciesCount +
            '}';
  }
}