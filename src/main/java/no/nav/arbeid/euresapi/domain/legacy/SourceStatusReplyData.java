package no.nav.arbeid.euresapi.domain.legacy;

import java.util.Collection;

public class SourceStatusReplyData {

  Collection<DataSourceStatus> dataSourceStatuses;

  public SourceStatusReplyData() {
  }

  public SourceStatusReplyData(Collection<DataSourceStatus> dataSourceStatuses) {
    this.dataSourceStatuses = dataSourceStatuses;
  }

  public Collection<DataSourceStatus> getDataSourceStatuses() {
    return dataSourceStatuses;
  }

  public void setDataSourceStatuses(Collection<DataSourceStatus> dataSourceStatuses) {
    this.dataSourceStatuses = dataSourceStatuses;
  }
}