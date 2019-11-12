package no.nav.arbeid.euresapi.domain.request;

import java.util.List;

public class FacetCriterion {

  private String   facetName;

  private List<String> facetValues;

  public FacetCriterion() {
  }

  public FacetCriterion(final String facetName, final List<String> facetValues) {
    this.facetName = facetName;
    this.facetValues = facetValues;
  }

  public String getFacetName() {
    return facetName;
  }

  public void setFacetName(String facetName) {
    this.facetName = facetName;
  }

  public List<String> getFacetValues() {
    return facetValues;
  }

  public void setFacetValues(List<String> facetValues) {
    this.facetValues = facetValues;
  }

  @Override
  public String toString() {
    return "FacetCriterion{" +
            ", facetName='" + facetName + '\'' +
            ", facetValues=" + facetValues +
            '}';
  }
}