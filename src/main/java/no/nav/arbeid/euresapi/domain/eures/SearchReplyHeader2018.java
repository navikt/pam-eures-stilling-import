package no.nav.arbeid.euresapi.domain.eures;

public class SearchReplyHeader2018 {

  private Parameters2018 parameters;

  public SearchReplyHeader2018(final Parameters2018 parameters) {
    this.parameters = parameters;
  }

  public SearchReplyHeader2018() {
  }

  public Parameters2018 getParameters() {
    return parameters;
  }

  public void setParameters(Parameters2018 parameters) {
    this.parameters = parameters;
  }

  @Override
  public String toString() {
    return "SearchReplyHeader2018{" +
            ", parameters=" + parameters +
            '}';
  }
}