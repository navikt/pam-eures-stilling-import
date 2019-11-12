package no.nav.arbeid.euresapi.domain.legacy;

public class GetCodeListsReplyHeader {

  private Parameters parameters;

  public GetCodeListsReplyHeader() {
  }

  public GetCodeListsReplyHeader(final Parameters parameters) {
    this.parameters = parameters;
  }

  public Parameters getParameters() {
    return parameters;
  }

  public void setParameters(Parameters parameters) {
    this.parameters = parameters;
  }

  @Override
  public String toString() {
    return "GetCodeListsReplyHeader{" +
            "parameters=" + parameters +
            '}';
  }
}