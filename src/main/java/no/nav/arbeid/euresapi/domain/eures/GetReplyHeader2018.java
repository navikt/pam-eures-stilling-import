package no.nav.arbeid.euresapi.domain.eures;

public class GetReplyHeader2018 {

  private GetReplyParameters2018 parameters;

  public GetReplyHeader2018() {
  }

  public GetReplyHeader2018(final GetReplyParameters2018 parameters) {
    this.parameters = parameters;
  }

  public GetReplyParameters2018 getParameters() {
    return parameters;
  }

  public void setParameters(GetReplyParameters2018 parameters) {
    this.parameters = parameters;
  }

  @Override
  public String toString() {
    return "GetReplyHeader2018{" +
            ", parameters=" + parameters +
            '}';
  }
}