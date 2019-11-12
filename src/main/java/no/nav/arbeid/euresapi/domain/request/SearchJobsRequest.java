package no.nav.arbeid.euresapi.domain.request;

public class SearchJobsRequest {

  private SearchCriteria searchCriteria;

  private DataSetRequest dataSetRequest;

  public SearchJobsRequest() {
  }

  public SearchJobsRequest(
      final SearchCriteria searchCriteria,
      final DataSetRequest dataSetRequest) {

    this.searchCriteria = searchCriteria;
    this.dataSetRequest = dataSetRequest;
  }

  public SearchCriteria getSearchCriteria() {
    return searchCriteria;
  }

  public void setSearchCriteria(SearchCriteria searchCriteria) {
    this.searchCriteria = searchCriteria;
  }

  public DataSetRequest getDataSetRequest() {
    return dataSetRequest;
  }

  public void setDataSetRequest(DataSetRequest dataSetRequest) {
    this.dataSetRequest = dataSetRequest;
  }

  @Override
  public String toString() {
    return "SearchJobsRequest{" +
            ", searchCriteria=" + searchCriteria +
            ", dataSetRequest=" + dataSetRequest +
            '}';
  }
}