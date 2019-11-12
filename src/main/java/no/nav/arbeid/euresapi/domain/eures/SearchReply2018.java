package no.nav.arbeid.euresapi.domain.eures;

public class SearchReply2018 {

  private SearchReplyHeader2018 header;

  private SearchReplyData2018 data;

  public SearchReply2018() { }

  public SearchReply2018(
      final SearchReplyHeader2018 header,
      final SearchReplyData2018 data) {
    this.header = header;
    this.data = data;
  }

  public SearchReplyHeader2018 getHeader() {
    return header;
  }

  public void setHeader(SearchReplyHeader2018 header) {
    this.header = header;
  }

  public SearchReplyData2018 getData() {
    return data;
  }

  public void setData(SearchReplyData2018 data) {
    this.data = data;
  }
}