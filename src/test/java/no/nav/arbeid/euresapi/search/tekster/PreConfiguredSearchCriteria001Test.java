package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.DataSource;
import no.nav.arbeid.euresapi.domain.request.FacetCriterion;
import no.nav.arbeid.euresapi.domain.request.Keyword;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * The test target discriminator is set in the extended class @linkAPreConfiguredSearchCriteriaTest
 *
 * @author r149852 on 19.06.2017.
 */
public class PreConfiguredSearchCriteria001Test {

    private String ledeteksterPath = "tekster_test001/tekster/euresapi";

    private ResourceBundlePropertyResolver simplePropertyResolver = new ResourceBundlePropertyResolver(ledeteksterPath);
    private PreConfiguredSearchCriteria preConfiguredSearchCriteria = new PreConfiguredSearchCriteria(simplePropertyResolver);

    @Test
    public void testGetDataSetRequestSortBy_defaultValueFromEmpty() {

        final String actualValue = preConfiguredSearchCriteria.getDataSetRequestSortBy();
        assertEquals("MOST_RECENT", actualValue);
    }

    @Test
    public void testGetDataSetRequestPageNumber_defaultValueFromNull() {

        final int actualValue = preConfiguredSearchCriteria.getDataSetRequestPageNumber();
        assertEquals(1, actualValue);
    }

    @Test
    public void testGetDataSetRequestResultsPerPage_defaultValueFromEmpty() {

        final int actualValue = preConfiguredSearchCriteria.getDataSetRequestResultsPerPage();
        assertTrue(10 == actualValue);
    }

    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywordLanguageCode_defaultValueFromEmpty() {

        final String actualValue = preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywordLanguageCode();
        assertEquals("en", actualValue);
    }

    @Test
    public void testGetDataSetRequestExcludedDataSources() {

        final Collection<DataSource> actualValues = preConfiguredSearchCriteria.getDataSetRequestExcludedDataSources();

        assertEquals(0, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywords_keywordScope() {

        final Collection<Keyword> actualValues = preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords();

        assertEquals(0, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywords_keywordText() {


        final Collection<Keyword> actualValues =
                preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords();

        assertEquals(0, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaFacetCriteria_facetName() {


        final Collection<FacetCriterion> actualValues = preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();
        assertEquals(0, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaFacetCriteria_facetValues() {


        final Collection<FacetCriterion> actualValues = preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();

        assertEquals(0, actualValues.size());
    }
}