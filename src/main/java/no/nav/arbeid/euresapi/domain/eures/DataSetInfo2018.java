package no.nav.arbeid.euresapi.domain.eures;

public class DataSetInfo2018 {

  private String sortBy;

  private Integer pageNumber;

  private Integer resultsPerPage;

  private Integer totalPageCount;

  private Integer totalMatchingCount;

  public DataSetInfo2018() {
  }

  public DataSetInfo2018(
      final String  sortBy,
      final Integer pageNumber,
      final Integer resultsPerPage,
      final Integer totalPageCount,
      final Integer totalMatchingCount
  ) {

    this.sortBy             = sortBy;
    this.pageNumber         = pageNumber;
    this.resultsPerPage     = resultsPerPage;
    this.totalPageCount     = totalPageCount;
    this.totalMatchingCount = totalMatchingCount;
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

  public Integer getTotalMatchingCount() {
    return totalMatchingCount;
  }

  public void setTotalMatchingCount(Integer totalMatchingCount) {
    this.totalMatchingCount = totalMatchingCount;
  }

  @Override
  public String toString() {
    return "DataSetInfo2018{" +
            ", sortBy='" + sortBy + '\'' +
            ", pageNumber=" + pageNumber +
            ", resultsPerPage=" + resultsPerPage +
            ", totalPageCount=" + totalPageCount +
            ", totalMatchingCount=" + totalMatchingCount +
            '}';
  }
}