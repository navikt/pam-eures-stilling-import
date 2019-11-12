package no.nav.arbeid.euresapi.search.tekster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test target discriminator is set in the extended class @linkAPreConfiguredSearchCriteriaTest
 * @author r149852 on 19.06.2017.
 */
public class PreConfiguredSearchCriteria003Test {


    private String ledeteksterPath = "tekster_test003/tekster/euresapi";


    private ResourceBundlePropertyResolver simplePropertyResolver = new ResourceBundlePropertyResolver(ledeteksterPath);
    private PreConfiguredSearchCriteria preConfiguredSearchCriteria = new PreConfiguredSearchCriteria(simplePropertyResolver);

    @Test
    public void testGetDataSetRequestPageNumber_defaultValueFromEmpty() throws IllegalAccessException {


        final int actualValue = preConfiguredSearchCriteria.getDataSetRequestPageNumber();
        assertEquals(1, actualValue);
    }
}