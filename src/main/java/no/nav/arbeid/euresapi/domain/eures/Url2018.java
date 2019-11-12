package no.nav.arbeid.euresapi.domain.eures;

public class Url2018 {

  private String urlName;

  private String urlValue;

  public Url2018() {
  }

  public Url2018(final String urlName, final String urlValue) {
    this.urlName  = urlName;
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
    return "Url2018{" +
            "urlName='" + urlName + '\'' +
            ", urlValue='" + urlValue + '\'' +
            '}';
  }
}