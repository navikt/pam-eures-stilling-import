package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.FacetCriterion;
import no.nav.arbeid.euresapi.domain.request.Keyword;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertNotNull;

/**
 * The test target discriminator is set in the extended class @linkAPreConfiguredSearchCriteriaTest
 * @author r149852 on 19.06.2017.
 */
public class PreConfiguredSearchCriteriaProdTest {


    private String ledeteksterPath = "tekster_prod/tekster/euresapi";

    private ResourceBundlePropertyResolver simplePropertyResolver = new ResourceBundlePropertyResolver(ledeteksterPath);
    private PreConfiguredSearchCriteria preConfiguredSearchCriteria = new PreConfiguredSearchCriteria(simplePropertyResolver);

    @Test
    public void testGetDataSetRequestSortBy_Mandatory() {

       

        String actualValue   = preConfiguredSearchCriteria.getDataSetRequestSortBy();
        assertNotNull("Sort by missing", actualValue);
    }

    @Test
    public void testMandatorySearchCriteria() {

       

        final Collection<FacetCriterion> actualFacetCriteria =
            preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();

        final Collection<Keyword> actualKeywords =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords();

        assertNotNull(
          "Both keyword and facet are missing as search criteria.",
          actualFacetCriteria.size() > 0 || actualKeywords.size() > 0);
    }

    @Test
    public void testPairedKeyword() {

       

        final Collection<Keyword> actualKeywords =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords();
        if (actualKeywords.size() > 0) {

            final Keyword firstKeyword = actualKeywords.iterator().next();

            assertNotNull("Keyword text missing", firstKeyword.getKeywordText());
            assertNotNull("Keyword Scope missing", firstKeyword.getKeywordScope());
        }
    }

    @Test
    public void testPairedFacet() {

       

        final Collection<FacetCriterion> actualFacetCriteria =
          preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();

        if (actualFacetCriteria.size() > 0) {

            final FacetCriterion firstFacetCriterion = actualFacetCriteria.iterator().next();

            assertNotNull("Facet name is missing", actualFacetCriteria.iterator().next().getFacetName());
            assertNotNull("Facet value(s) missing", actualFacetCriteria.iterator().next().getFacetValues());
        }
    }

    @Test
    public void testMandatoryLanguageCode() {

       

        final String actualValue =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywordLanguageCode();
        assertNotNull("Language code missing", actualValue);
    }

    @Test
    public void testMandatoryResultsPerPage() {

       

        final Integer actualValue   = preConfiguredSearchCriteria.getDataSetRequestResultsPerPage();
        assertNotNull("Results per page missing", actualValue);
    }
}