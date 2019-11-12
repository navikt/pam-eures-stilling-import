package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.FacetCriterion;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * The test target discriminator is set in the extended class @linkAPreConfiguredSearchCriteriaTest
 * @author r149852 on 19.06.2017.
 */
public class PreConfiguredSearchCriteria002Test {

    private String ledeteksterPath = "tekster_test002/tekster/euresapi";

    private ResourceBundlePropertyResolver simplePropertyResolver = new ResourceBundlePropertyResolver(ledeteksterPath);
    private PreConfiguredSearchCriteria preConfiguredSearchCriteria = new PreConfiguredSearchCriteria(simplePropertyResolver);

    @Test
    public void testGetSearchCriteriaFacetCriteria_facetName_key_value_mismatch () {


        final Collection<FacetCriterion > actualValues =
          preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();
        assertEquals(0, actualValues.size());
    }

    /**
     * The properties file contains no entry for the
     * tested property, default should be returned.
     * @throws IllegalAccessException
     */
    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywordLanguageCode_defaultValueFromNull() throws IllegalAccessException {

       

        final String actualValue =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywordLanguageCode();
        assertEquals("en", actualValue);
    }

    /**
     * The properties file contains no entry for the
     * tested property, default should be returned.
     * @throws IllegalAccessException
     */
    @Test
    public void testGetDataSetRequestSortBy_defaultValueFromNull() throws IllegalAccessException {

       

        final String actualValue   = preConfiguredSearchCriteria.getDataSetRequestSortBy();
        assertEquals("MOST_RECENT", actualValue);
    }

    @Test
    public void testGetDataSetRequestPageNumber_defaultValueFromNull() throws IllegalAccessException {

       

        final int actualValue = preConfiguredSearchCriteria.getDataSetRequestPageNumber();
        assertEquals(1, actualValue);
    }
}