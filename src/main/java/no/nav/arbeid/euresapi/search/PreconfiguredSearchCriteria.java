package no.nav.arbeid.euresapi.search;

import no.nav.arbeid.euresapi.services.eures.EuresSearchQueryFactory;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Component
class PreconfiguredSearchCriteria implements EuresSearchQueryFactory {

    private static final String FILENAME = "predefined/search/predefined_search.json";

    private final String json;

    PreconfiguredSearchCriteria() {
        try(InputStream is = getClass().getClassLoader().getResourceAsStream(FILENAME)) {

            if(is == null) throw new IllegalStateException("null inputstream when reading file " + FILENAME);

            try(InputStreamReader inputStreamReader = new InputStreamReader(is); BufferedReader reader = new BufferedReader(inputStreamReader)) {
                json = reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }

        } catch (IOException e) {
            throw new IllegalStateException("Could not read file " + FILENAME, e);
        }
    }

    @Override
    public String asJson() {

        return json;
    }

}
