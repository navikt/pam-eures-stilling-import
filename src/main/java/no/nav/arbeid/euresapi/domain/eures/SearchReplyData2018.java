package no.nav.arbeid.euresapi.domain.eures;

import java.util.List;

public class SearchReplyData2018 {

  private DataSetInfo2018 dataSetInfo;

  private List<Item2018> items;

  public SearchReplyData2018() {}

  public SearchReplyData2018(final DataSetInfo2018 dataSetInfo, final List<Item2018> items) {
    this.dataSetInfo = dataSetInfo;
    this.items = items;
  }

  public DataSetInfo2018 getDataSetInfo() {
    return dataSetInfo;
  }

  public void setDataSetInfo(DataSetInfo2018 dataSetInfo) {
    this.dataSetInfo = dataSetInfo;
  }

  public List<Item2018> getItems() {
    return items;
  }

  public void setItems(List<Item2018> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "SearchReplyData2018{" +
            ", dataSetInfo=" + dataSetInfo +
            ", items=" + items +
            '}';
  }
}