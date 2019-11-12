package no.nav.arbeid.euresapi.domain.legacy;

public class JobFacet {

  public static final String FACET_NAME_CONTRACT_DURATION = "CONTRACT_DURATION";
  public static final String FACET_NAME_CONTRACT_TYPE = "CONTRACT_TYPE";
  public static final String FACET_NAME_EDUCATION_LEVEL = "EDUCATION_LEVEL";
  public static final String FACET_NAME_EURES_FLAG = "EURES_FLAG";
  public static final String FACET_NAME_EXPERIENCE = "EXPERIENCE";
  public static final String FACET_NAME_LOCATION = "LOCATION";
  public static final String FACET_NAME_OCCUPATION = "OCCUPATION";
  public static final String FACET_NAME_PUBLICATION_PERIOD = "PUBLICATION_PERIOD";

  private String facetName;

  private String facetValue;

  private String facetDescription;

  public JobFacet() {
  }

  public JobFacet(final String facetName, final String facetValue, final String facetDescription) {
    this.facetName = facetName;
    this.facetValue = facetValue;
    this.facetDescription = facetDescription;
  }

  public String getFacetName() {
    return facetName;
  }

  public void setFacetName(String facetName) {
    this.facetName = facetName;
  }

  public String getFacetValue() {
    return facetValue;
  }

  public void setFacetValue(String facetValue) {
    this.facetValue = facetValue;
  }

  public String getFacetDescription() {
    return facetDescription;
  }

  public void setFacetDescription(String facetDescription) {
    this.facetDescription = facetDescription;
  }

  @Override
  public String toString() {
    return "JobFacet{" +
            ", facetName='" + facetName + '\'' +
            ", facetValue='" + facetValue + '\'' +
            ", facetDescription='" + facetDescription + '\'' +
            '}';
  }
}