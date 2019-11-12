package no.nav.arbeid.euresapi.search.tekster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * The test target discriminator is set in the extended class @linkAPreConfiguredSearchCriteriaTest
 * @author r149852 on 19.06.2017.
 */
public class PreConfiguredSearchCriteria004Test {



    private String ledeteksterPath = "tekster_test004/tekster/euresapi";


    //    private SimplePropertyResolver simplePropertyResolver = new PreConfiguredSearchCriteriaPropertyResolver(
//            new TeksterAPI(ledeteksterPath + "/tekster", TeksterConfiguration.BUNDLE_NAME), ledeteksterPath);
    private ResourceBundlePropertyResolver simplePropertyResolver = new ResourceBundlePropertyResolver(ledeteksterPath);
    private PreConfiguredSearchCriteria preConfiguredSearchCriteria = new PreConfiguredSearchCriteria(simplePropertyResolver);

    @Test
    public void testGetDataSetRequestPageNumber() throws IllegalAccessException {


        final int actualValue = preConfiguredSearchCriteria.getDataSetRequestPageNumber();
        assertEquals(7, actualValue);
    }
}