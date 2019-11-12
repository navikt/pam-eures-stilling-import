package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.FacetCriterion;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

class FacetCriteriaLoader {

    private final ResourceBundlePropertyResolver propertyResolver;

    FacetCriteriaLoader(ResourceBundlePropertyResolver propertyResolver) {
        this.propertyResolver = propertyResolver;
    }

    /**
     * See <a href="https://www.dropbox.com/sh/8mrlqmrnq0kijge/AADUP406qNv7JfmXZxJSmgRWa/OLD%20REGULATION_CURRENT/Documents/Search%20Engine%20OUTPUT%20API%20documents/API%20V3?dl=0&preview=EURES-SEAPIv3-FMES-+Service+specifications+v1.20.docx">EURES SE API v3 Functional Message Exchange Specifications</a>
     */
    List<FacetCriterion> loadFacetCriteria() {

        return IntStream.rangeClosed(1, 20)
                .mapToObj(i -> createFacetCriterion(nameKeyFrom(i), valueKeyFrom(i)))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private FacetCriterion createFacetCriterion(String keyProperty, String valueProperty) {

        Optional<String> name = propertyResolver.getProperty(keyProperty);
        Optional<String> values = propertyResolver.getProperty(valueProperty);

        if(name.isEmpty()) {
            return null;
        }

        if(values.isEmpty()) {
            return null;
        }

        if(name.get().isBlank() && values.get().isBlank()) {
            return null;
        }

        return new FacetCriterion(name.get(), asList(values.orElse("").split(",")));

    }

    private String nameKeyFrom(int i) {
        return String.format("searchCriteria.facetCriteria.%02d.facetName", i);
    }
    private String valueKeyFrom(int i) {
        return String.format("searchCriteria.facetCriteria.%02d.facetValues", i);
    }
}
