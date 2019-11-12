package no.nav.arbeid.euresapi.search;

import no.nav.arbeid.euresapi.domain.request.*;
import no.nav.arbeid.euresapi.search.tekster.PreConfiguredSearchCriteria;
import org.springframework.stereotype.Repository;

@Repository
public class SearchJobsRequestPropertiesRepository {

  private final PreConfiguredSearchCriteria preConfiguredSearchCriteria;

  public SearchJobsRequestPropertiesRepository(PreConfiguredSearchCriteria preConfiguredSearchCriteria) {
    this.preConfiguredSearchCriteria = preConfiguredSearchCriteria;
  }

  public SearchJobsRequest getPredefinedSearchJobsRequest() {

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