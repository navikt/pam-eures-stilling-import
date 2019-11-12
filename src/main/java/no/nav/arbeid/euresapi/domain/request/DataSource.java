package no.nav.arbeid.euresapi.domain.request;

public class DataSource {

  private Integer dataSourceId;

  public DataSource() {}
  public DataSource(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public Integer getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }
}