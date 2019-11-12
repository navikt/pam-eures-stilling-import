package no.nav.arbeid.euresapi.domain.eures;

import java.util.ArrayList;
import java.util.List;

public class GetReplyData2018 {

  private List<GetReplyItem2018> items = new ArrayList<>();

  public GetReplyData2018() {
  }

  public GetReplyData2018(List<GetReplyItem2018> items) {
    this.items = items;
  }

  public List<GetReplyItem2018> getItems() {
    return items;
  }

  public void setItems(List<GetReplyItem2018> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "GetReplyData2018{" +
            ", items=" + items +
            '}';
  }
}