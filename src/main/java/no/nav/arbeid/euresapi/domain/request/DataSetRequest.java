package no.nav.arbeid.euresapi.domain.request;

import java.util.List;

public class DataSetRequest {


  private String sortBy;

  
  private Integer pageNumber;

  
  private Integer resultsPerPage;

  private List<DataSource> excludedDataSources;

  public DataSetRequest() {
  }

  public DataSetRequest(
      final String      sortBy,
      final Integer     pageNumber,
      final Integer     resultsPerPage,
      final List<DataSource> excludedDataSources) {
    this.sortBy = sortBy;
    this.pageNumber = pageNumber;
    this.resultsPerPage = resultsPerPage;
    this.excludedDataSources = excludedDataSources;
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

  public List<DataSource> getExcludedDataSources() {
    return excludedDataSources;
  }

  public void setExcludedDataSources(List<DataSource> excludedDataSources) {
    this.excludedDataSources = excludedDataSources;
  }

  @Override
  public String toString() {
    return "DataSetRequest{" +
            ", sortBy='" + sortBy + '\'' +
            ", pageNumber=" + pageNumber +
            ", resultsPerPage=" + resultsPerPage +
            ", excludedDataSources=" + excludedDataSources +
            '}';
  }
}