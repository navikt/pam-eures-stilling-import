package no.nav.arbeid.euresapi.domain.eures;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

public class GetRequest2018 {

  private String view;

  @JsonProperty("handle")
  private Collection<String> handles = new ArrayList<>();

  public GetRequest2018() {}

  public GetRequest2018(final String view, final Collection<String> handles) {
    this.view = view;
    this.handles = handles;
  }

  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }

  public Collection<String> getHandles() {
    return handles;
  }

  public void setHandles(Collection<String> handles) {
    this.handles = handles;
  }

  @Override
  public String toString() {
    return "GetRequest2018{" +
            ", view='" + view + '\'' +
            ", handles=" + handles +
            '}';
  }
}