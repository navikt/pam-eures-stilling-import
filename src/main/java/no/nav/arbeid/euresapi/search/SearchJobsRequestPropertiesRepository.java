package no.nav.arbeid.euresapi.search;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.nav.arbeid.euresapi.domain.request.*;
import no.nav.arbeid.euresapi.search.tekster.PreConfiguredSearchCriteria;
import no.nav.arbeid.euresapi.services.eures.EuresSearchQueryFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SearchJobsRequestPropertiesRepository implements EuresSearchQueryFactory {

  private final PreConfiguredSearchCriteria preConfiguredSearchCriteria;

  private ObjectMapper mapper;

  public SearchJobsRequestPropertiesRepository(PreConfiguredSearchCriteria preConfiguredSearchCriteria) {
    this.preConfiguredSearchCriteria = preConfiguredSearchCriteria;
    mapper = new ObjectMapper();
  }

  @Override
  public String asJson() {
    try {
      return mapper.writeValueAsString(getPredefinedSearchJobsRequest());
    } catch (JsonProcessingException e) {
      throw new IllegalStateException(e);
    }
  }

  private SearchJobsRequest getPredefinedSearchJobsRequest() {

    return new SearchJobsRequest(
            predefinedSearchCriteria(),
            predefinedDataSetRequest()
    );
  }


  private SearchCriteria predefinedSearchCriteria() {

    return new SearchCriteria(
            predefinedKeywordCriteria(),
            preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria()
    );
  }

  private KeywordCriteria predefinedKeywordCriteria() {

    return new KeywordCriteria(
            preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywordLanguageCode(),
            preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords()
    );
  }

  private DataSetRequest predefinedDataSetRequest() {

    return new DataSetRequest(
            preConfiguredSearchCriteria.getDataSetRequestSortBy(),
            preConfiguredSearchCriteria.getDataSetRequestPageNumber(),
            preConfiguredSearchCriteria.getDataSetRequestResultsPerPage(),
            preConfiguredSearchCriteria.getDataSetRequestExcludedDataSources()
    );
  }
}