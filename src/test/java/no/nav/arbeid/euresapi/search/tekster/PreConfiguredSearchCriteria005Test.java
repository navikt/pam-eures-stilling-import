package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.DataSource;
import no.nav.arbeid.euresapi.domain.request.FacetCriterion;
import no.nav.arbeid.euresapi.domain.request.Keyword;
import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;

import static no.nav.arbeid.euresapi.domain.legacy.JobFacet.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * The test target discriminator is set in the extended class @linkAPreConfiguredSearchCriteriaTest
 * @author r149852 on 19.06.2017.
 */
public class PreConfiguredSearchCriteria005Test {


    private String ledeteksterPath = "tekster_test005/tekster/euresapi";


    //    private SimplePropertyResolver simplePropertyResolver = new PreConfiguredSearchCriteriaPropertyResolver(
//            new TeksterAPI(ledeteksterPath + "/tekster", TeksterConfiguration.BUNDLE_NAME), ledeteksterPath);
    private ResourceBundlePropertyResolver simplePropertyResolver = new ResourceBundlePropertyResolver(ledeteksterPath);
    private PreConfiguredSearchCriteria preConfiguredSearchCriteria = new PreConfiguredSearchCriteria(simplePropertyResolver);

    @Test
    public void testGetDataSetRequestSortBy_defaultValueFromEmpty() throws IllegalAccessException {

       

        final String actualValue   = preConfiguredSearchCriteria.getDataSetRequestSortBy();
        assertEquals("BEST_MATCH", actualValue);
    }

    @Test
    public void testGetDataSetRequestResultsPerPage() throws IllegalAccessException {

       

      final int actualValue   = preConfiguredSearchCriteria.getDataSetRequestResultsPerPage();
        assertEquals(100, actualValue);

    }

    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywordLanguageCode_defaultValueFromEmpty() throws IllegalAccessException {

       

        final String actualValue =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywordLanguageCode();
        assertEquals("en", actualValue);
    }

    @Test
    public void testGetDataSetRequestExcludedDataSources() throws IllegalAccessException {

       

        final Collection<DataSource> actualValues =
          preConfiguredSearchCriteria.getDataSetRequestExcludedDataSources();

        assertEquals(3, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywords_keywordScope() throws IllegalAccessException {

       

        final Collection<Keyword> actualValues =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords();


        assertEquals(2, actualValues.size());

        actualValues.removeIf(keyword -> keyword.getKeywordScope().equals("JOB_DESCRIPTION"));
        actualValues.removeIf(keyword -> keyword.getKeywordScope().equals("JOB_TITLE"));
        assertEquals(0, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaKeywordCriteriaKeywords_keywordText() throws IllegalAccessException {

       

        final Collection<Keyword> actualValues =
          preConfiguredSearchCriteria.getSearchCriteriaKeywordCriteriaKeywords();

        assertEquals(2, actualValues.size());

        actualValues.removeIf(keyword -> keyword.getKeywordText().equals("Analyst"));
        actualValues.removeIf(keyword -> keyword.getKeywordText().equals("System"));
        assertEquals(0, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaFacetCriteria_facetName() {

       

        final Collection<FacetCriterion> actualValues =
          preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();
        assertEquals(8, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaFacetCriteria_facetValues() {

       

        final Collection<FacetCriterion > actualValues =
          preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();

        assertEquals(8, actualValues.size());
    }

    @Test
    public void testGetSearchCriteriaFacetCriteria_FacetNames() throws IllegalAccessException {

       

        final Collection<FacetCriterion > actualFacetCriteria =
          preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();

        final Set<String> expectedFacetNames = new HashSet<String>(){{
            add(FACET_NAME_LOCATION);
            add(FACET_NAME_EDUCATION_LEVEL);
            add(FACET_NAME_CONTRACT_TYPE);
            add(FACET_NAME_CONTRACT_DURATION);
            add(FACET_NAME_EXPERIENCE);
            add(FACET_NAME_PUBLICATION_PERIOD);
            add(FACET_NAME_EURES_FLAG);
            add(FACET_NAME_OCCUPATION);
        }};

        final Predicate<FacetCriterion> predicate = p-> expectedFacetNames.contains(p.getFacetName());
        actualFacetCriteria.removeIf(predicate);

        assertEquals(0, actualFacetCriteria.size());
    }

    @Test
    public void testGetSearchCriteriaFacetCriteria_FacetValues() throws IllegalAccessException {

       

        final Collection<FacetCriterion> actualFacetCriteria =
          preConfiguredSearchCriteria.getSearchCriteriaFacetCriteria();

        final Map<String, Set<String>> expectedFacetCriteria =
            new HashMap<String, Set<String>>() {{

                put(FACET_NAME_LOCATION, new HashSet<String>() {{
                    add("BE211");
                    add("BE231");
                    add("FR");
                    add("NO");
                    add("BE");
                }});

                put(FACET_NAME_EDUCATION_LEVEL, new HashSet<String>() {{
                    add("5");
                }});

                put(FACET_NAME_CONTRACT_TYPE, new HashSet<String>() {{
                    add("F");
                }});

                put(FACET_NAME_CONTRACT_DURATION, new HashSet<String>() {{
                    add("P_NAIS");
                }});

                put(FACET_NAME_EXPERIENCE, new HashSet<String>() {{
                    add("E");
                }});

                put(FACET_NAME_PUBLICATION_PERIOD, new HashSet<String>() {{
                    add("LAST_WEEK");
                }});

                put(FACET_NAME_EURES_FLAG, new HashSet<String>() {{
                    add("false");
                }});

                put(FACET_NAME_OCCUPATION, new HashSet<String>() {{
                    add("2");
                    add("214");
                }});
        }};

        for (final FacetCriterion actualFacetCriterion : actualFacetCriteria) {

            assertTrue(
       "Unexpected facet name: "
              + actualFacetCriterion.getFacetName(),
              expectedFacetCriteria.keySet().contains(actualFacetCriterion.getFacetName())
            );

            final Set<String> expectedValues =
              expectedFacetCriteria.get(actualFacetCriterion.getFacetName());

            final List<String> actualFacetValues = actualFacetCriterion.getFacetValues();

            expectedValues.containsAll(actualFacetCriterion.getFacetValues());
            actualFacetCriterion.getFacetValues().containsAll(expectedValues);
        }
    }
}