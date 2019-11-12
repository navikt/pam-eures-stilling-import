package no.nav.arbeid.euresapi.domain.legacy;

public class DataSourceStatus {

  private String dataSourceId;

  private String dataSourceName;

  private String available;

  public DataSourceStatus() {
  }

  public DataSourceStatus(
      final String dataSourceId,
      final String dataSourceName,
      final String available) {

    this.dataSourceId = dataSourceId;
    this.dataSourceName = dataSourceName;
    this.available = available;
  }

  public String getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }

  public String getDataSourceName() {
    return dataSourceName;
  }

  public void setDataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }

  public String getAvailable() {
    return available;
  }

  public void setAvailable(String available) {
    this.available = available;
  }
}