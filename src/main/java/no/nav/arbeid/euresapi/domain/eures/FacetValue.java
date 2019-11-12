package no.nav.arbeid.euresapi.domain.eures;

public class FacetValue {

  private String value;

  public FacetValue() {
  }

  public FacetValue(final String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "FacetValue{" +
            ", value='" + value + '\'' +
            '}';
  }
}