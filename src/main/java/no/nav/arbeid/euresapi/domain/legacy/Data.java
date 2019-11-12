package no.nav.arbeid.euresapi.domain.legacy;

import java.util.ArrayList;
import java.util.List;

public class Data {

  private List<Item> items = new ArrayList<>();

  public Data() {
  }

  public Data(final List<Item> items) {
    this.items = items;
  }


  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  @Override
  public String toString() {
    return "Data{" +
            ", items=" + items +
            '}';
  }
}