package no.nav.arbeid.euresapi.domain.legacy;

public class Header {

  private String disclaimer;

  private Parameters parameters;

  private DataSetInfo dataSetInfo;

  public Header() {
  }

  public Header(
      final String disclaimer,
      final Parameters parameters,
      final DataSetInfo dataSetInfo) {
    this.disclaimer = disclaimer;
    this.parameters = parameters;
    this.dataSetInfo = dataSetInfo;
  }

  public String getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  public Parameters getParameters() {
    return parameters;
  }

  public void setParameters(Parameters parameters) {
    this.parameters = parameters;
  }

  public DataSetInfo getDataSetInfo() {
    return dataSetInfo;
  }

  public void setDataSetInfo(DataSetInfo dataSetInfo) {
    this.dataSetInfo = dataSetInfo;
  }

  @Override
  public String toString() {
    return "Header{" +
            ", disclaimer='" + disclaimer + '\'' +
            ", parameters=" + parameters +
            ", dataSetInfo=" + dataSetInfo +
            '}';
  }
}