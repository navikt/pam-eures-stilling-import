package no.nav.arbeid.euresapi.domain.legacy;

public class Url {

  public static final String URL_NAME_EURES_PORTAL = "EURES portal";

  private String urlName;

  private String urlValue;

  public Url() {
  }

  public Url(final String urlName, final String urlValue) {
    this.urlName = urlName;
    this.urlValue = urlValue;
  }

  public String getUrlName() {
    return urlName;
  }

  public void setUrlName(String urlName) {
    this.urlName = urlName;
  }

  public String getUrlValue() {
    return urlValue;
  }

  public void setUrlValue(String urlValue) {
    this.urlValue = urlValue;
  }

  @Override
  public String toString() {
    return "Url{" +
            ", urlName='" + urlName + '\'' +
            ", urlValue='" + urlValue + '\'' +
            '}';
  }
}