package no.nav.arbeid.euresapi.domain.request;

import java.util.Collection;

public class SearchCriteria {

  private KeywordCriteria keywordCriteria;

  private Collection<FacetCriterion> facetCriteria;

  public SearchCriteria() {
  }

  public SearchCriteria(
      final KeywordCriteria keywordCriteria,
      final Collection<FacetCriterion> facetCriteria
  ) {
    this.keywordCriteria = keywordCriteria;
    this.facetCriteria = facetCriteria;
  }

  public KeywordCriteria getKeywordCriteria() {
    return keywordCriteria;
  }

  public void setKeywordCriteria(KeywordCriteria keywordCriteria) {
    this.keywordCriteria = keywordCriteria;
  }

  public Collection<FacetCriterion> getFacetCriteria() {
    return facetCriteria;
  }

  public void setFacetCriteria(Collection<FacetCriterion> facetCriteria) {
    this.facetCriteria = facetCriteria;
  }

  @Override
  public String toString() {
    return "SearchCriteria{" +
            ", keywordCriteria=" + keywordCriteria +
            ", facetCriteria=" + facetCriteria +
            '}';
  }
}