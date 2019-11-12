package no.nav.arbeid.euresapi.domain.eures;

import java.util.Collection;

public class GetReplyRelated2018 {

  private Collection<GetReplyUrl2018> urls;

  public GetReplyRelated2018() {
  }

  public GetReplyRelated2018(final Collection<GetReplyUrl2018> urls) {
    this.urls = urls;
  }

  public Collection<GetReplyUrl2018> getUrls() {
    return urls;
  }

  public void setUrls(Collection<GetReplyUrl2018> urls) {
    this.urls = urls;
  }

  @Override
  public String toString() {
    return "GetReplyRelated2018{" +
            ", urls=" + urls +
            '}';
  }
}