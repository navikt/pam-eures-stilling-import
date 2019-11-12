package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.DataSource;
import no.nav.arbeid.euresapi.domain.request.FacetCriterion;
import no.nav.arbeid.euresapi.domain.request.Keyword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class PreConfiguredSearchCriteria {

    private static final String PROP_KEY_LANG = "searchCriteria.keywordCriteria.keywordLanguageCode";
    private static final String PROP_KEY_SORT_BY = "dataSetRequest.sortBy";
    private static final String PROP_KEY_RES_PR_PAGE = "dataSetRequest.resultsPerPage";
    private static final String PROP_KEY_PAGE_NR = "dataSetRequest.pageNumber";

    private static final String PROP_DEFAULTVALUE_SORT_BY = "MOST_RECENT";
    private static final int PROP_DEFAULTVALUE_RES_PR_PAGE = 10;
    private static final int PROP_DEFAULTVALUE_PAGE_NR = 1;
    private static final String PROP_DEFAULTVALUE_LANG = "en";

    private final ResourceBundlePropertyResolver simplePropertyResolver;

    private final FacetCriteriaLoader facetCriterionFactory;
    private final KeywordQueryLoader keywordFactory;
    private final DatasourceQueryLoader datasourceQueryLoader;

    @Autowired
    public PreConfiguredSearchCriteria(ResourceBundlePropertyResolver simplePropertyResolver) {
        this.simplePropertyResolver = simplePropertyResolver;
        facetCriterionFactory = new FacetCriteriaLoader(simplePropertyResolver);
        keywordFactory = new KeywordQueryLoader(simplePropertyResolver);

        datasourceQueryLoader = new DatasourceQueryLoader(simplePropertyResolver);
    }

    public String getSearchCriteriaKeywordCriteriaKeywordLanguageCode() {

        return simplePropertyResolver.getProperty(PROP_KEY_LANG)
                .filter(s -> !s.isBlank())
                .orElse(PROP_DEFAULTVALUE_LANG);
    }

    public String getDataSetRequestSortBy() {

        return simplePropertyResolver.getProperty(PROP_KEY_SORT_BY)
                .filter(s -> !s.isBlank())
                .orElse(PROP_DEFAULTVALUE_SORT_BY);
    }

    public int getDataSetRequestResultsPerPage() {

        return simplePropertyResolver.getIntProperty(PROP_KEY_RES_PR_PAGE).orElse(PROP_DEFAULTVALUE_RES_PR_PAGE);
    }

    public Integer getDataSetRequestPageNumber() {

        return simplePropertyResolver.getIntProperty(PROP_KEY_PAGE_NR).orElse(PROP_DEFAULTVALUE_PAGE_NR);
    }

    /**
     * See <a href="https://www.dropbox.com/sh/8mrlqmrnq0kijge/AADUP406qNv7JfmXZxJSmgRWa/OLD%20REGULATION_CURRENT/Documents/Search%20Engine%20OUTPUT%20API%20documents/API%20V3?dl=0&preview=EURES-SEAPIv3-FMES-+Service+specifications+v1.20.docx">EURES SE API v3 Functional Message Exchange Specifications</a>
     */
    public Collection<Keyword> getSearchCriteriaKeywordCriteriaKeywords() {
        return keywordFactory.loadKeywordCriteria();
    }

    public List<DataSource> getDataSetRequestExcludedDataSources() {
        return datasourceQueryLoader.loadExcludedDatasources();
    }

    /**
     * See <a href="https://www.dropbox.com/sh/8mrlqmrnq0kijge/AADUP406qNv7JfmXZxJSmgRWa/OLD%20REGULATION_CURRENT/Documents/Search%20Engine%20OUTPUT%20API%20documents/API%20V3?dl=0&preview=EURES-SEAPIv3-FMES-+Service+specifications+v1.20.docx">EURES SE API v3 Functional Message Exchange Specifications</a>
     */
    public Collection<FacetCriterion> getSearchCriteriaFacetCriteria() {
        return facetCriterionFactory.loadFacetCriteria();
    }

}