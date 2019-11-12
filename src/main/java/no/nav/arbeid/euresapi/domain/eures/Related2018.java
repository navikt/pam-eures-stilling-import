package no.nav.arbeid.euresapi.domain.eures;

import java.util.List;

public class Related2018 {

  private List<Url2018> urls;

  public Related2018() {
  }

  public Related2018(final List<Url2018> urls) {
    this.urls = urls;
  }

  public List<Url2018> getUrls() {
    return urls;
  }

  public void setUrls(List<Url2018> urls) {
    this.urls = urls;
  }
}