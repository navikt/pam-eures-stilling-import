package no.nav.arbeid.euresapi.domain.legacy;

public class SourceStatusReply {

  private Header header;

  private SourceStatusReplyData data;

  public SourceStatusReply() {
  }

  public SourceStatusReply(final Header header, final SourceStatusReplyData data) {
    this.header = header;
    this.data = data;
  }

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  public SourceStatusReplyData getData() {
    return data;
  }

  public void setData(SourceStatusReplyData data) {
    this.data = data;
  }
}