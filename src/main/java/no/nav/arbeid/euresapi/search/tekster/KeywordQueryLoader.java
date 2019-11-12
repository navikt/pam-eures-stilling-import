package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.Keyword;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class KeywordQueryLoader {

    private final ResourceBundlePropertyResolver propertyResolver;

    KeywordQueryLoader(ResourceBundlePropertyResolver propertyResolver) {
        this.propertyResolver = propertyResolver;
    }

    List<Keyword> loadKeywordCriteria() {

        return IntStream.rangeClosed(1, 20)
                .mapToObj(i -> createKeywordCriteria(textsKeyFrom(i), scopesKeyFrom(i)))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private Keyword createKeywordCriteria(String textKeyFrom, String scopeKeyFrom) {

        Optional<String> text = propertyResolver.getProperty(textKeyFrom);
        Optional<String> scope = propertyResolver.getProperty(scopeKeyFrom);

        if(text.isEmpty()) {
            return null;
        }

        if(scope.isEmpty()) {
            return null;
        }

        if(text.get().isBlank() && scope.get().isBlank()) {
            return null;
        }

        return new Keyword(text.get(), scope.get());
    }

    private String textsKeyFrom(int i) {
        return String.format("searchCriteria.keywordCriteria.keywords.%02d.keywordText", i);
    }

    private String scopesKeyFrom(int i) {
        return String.format("searchCriteria.keywordCriteria.keywords.%02d.keywordScope", i);
    }
}
