package no.nav.arbeid.euresapi.domain.legacy;

import java.util.List;

public class Related {

  private List<Url> urls;

  public Related() {
  }

  public Related(final List<Url> urls) {
    this.urls = urls;
  }

  public List<Url> getUrls() {
    return urls;
  }

  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }
}