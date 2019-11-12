package no.nav.arbeid.euresapi.domain.legacy;

public class SearchJobsReply {

  private Header header;

  private Data data;

  public SearchJobsReply() {
  }

  public SearchJobsReply(final Header header, final Data data) {
    this.header = header;
    this.data = data;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public Data getData() {
    return data;
  }

  public void setData(Data data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "SearchJobsReply{" +
            ", header=" + header +
            ", data=" + data +
            '}';
  }
}