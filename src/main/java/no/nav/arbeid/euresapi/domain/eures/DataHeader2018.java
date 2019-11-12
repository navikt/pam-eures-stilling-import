package no.nav.arbeid.euresapi.domain.eures;

public class DataHeader2018 {

  private String handle;

  private Integer dataSourceId;

  private String dataSourceName;

  private String dataSourceJvReference;

  public DataHeader2018() {}

  DataHeader2018(
      final String   handle,
      final Integer  dataSourceId,
      final String   dataSourceName,
      final String   dataSourceJvReference
  ) {

    this.handle                = handle;
    this.dataSourceId          = dataSourceId;
    this.dataSourceName        = dataSourceName;
    this.dataSourceJvReference = dataSourceJvReference;
  }

  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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

  public String getDataSourceJvReference() {
    return dataSourceJvReference;
  }

  public void setDataSourceJvReference(String dataSourceJvReference) {
    this.dataSourceJvReference = dataSourceJvReference;
  }

  @Override
  public String toString() {
    return "DataHeader2018{" +
            ", handle='" + handle + '\'' +
            ", dataSourceId=" + dataSourceId +
            ", dataSourceName='" + dataSourceName + '\'' +
            ", dataSourceJvReference='" + dataSourceJvReference + '\'' +
            '}';
  }
}