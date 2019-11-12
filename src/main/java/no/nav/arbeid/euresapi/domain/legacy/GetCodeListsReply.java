package no.nav.arbeid.euresapi.domain.legacy;

public class GetCodeListsReply {

  private GetCodeListsReplyHeader header;

  private GetCodeListsReplyData data;

  public GetCodeListsReplyHeader getHeader() {
    return header;
  }

  public void setHeader(GetCodeListsReplyHeader header) {
    this.header = header;
  }

  public GetCodeListsReplyData getData() {
    return data;
  }

  public void setData(GetCodeListsReplyData data) {
    this.data = data;
  }

  public GetCodeListsReply() {
  }

  public GetCodeListsReply(
          final GetCodeListsReplyHeader header,
          final GetCodeListsReplyData data
  ) {
    this.header = header;
    this.data = data;
  }

}