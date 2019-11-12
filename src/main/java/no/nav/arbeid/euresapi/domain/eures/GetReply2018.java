package no.nav.arbeid.euresapi.domain.eures;

public class GetReply2018 {

  private GetReplyHeader2018 header;

  private GetReplyData2018 data;

  public GetReply2018() {
  }

  public GetReply2018(final GetReplyHeader2018 header, final GetReplyData2018 data) {
    this.header = header;
    this.data = data;
  }

  public GetReplyHeader2018 getHeader() {
    return header;
  }

  public void setHeader(GetReplyHeader2018 header) {
    this.header = header;
  }

  public GetReplyData2018 getData() {
    return data;
  }

  public void setData(GetReplyData2018 data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "GetReply2018{" +
            ", header=" + header +
            ", data=" + data +
            '}';
  }
}