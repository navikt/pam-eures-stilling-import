package no.nav.arbeid.euresapi.search.tekster;

import no.nav.arbeid.euresapi.domain.request.DataSource;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class DatasourceQueryLoader {

    private final ResourceBundlePropertyResolver propertyResolver;
    private static final String PROP_KEY_EXCL_DTA_SRC = "dataSetRequest.excludedDataSource";

    DatasourceQueryLoader(ResourceBundlePropertyResolver propertyResolver) {
        this.propertyResolver = propertyResolver;
    }

    List<DataSource> loadExcludedDatasources() {

        return IntStream.rangeClosed(1, 20)
                .mapToObj(this::excludedDatasourceKey)
                .map(propertyResolver::getIntProperty)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(value -> new DataSource(value))
                .collect(Collectors.toList());
    }


    private String excludedDatasourceKey(int i) {
        return String.format("dataSetRequest.excludedDataSource.%02d", i);
    }
}
