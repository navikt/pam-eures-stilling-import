package no.nav.arbeid.euresapi.search.tekster;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

@Service
class ResourceBundlePropertyResolver {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResourceBundlePropertyResolver.class);
    private static final Locale BUNDLE_LOCALE = Locale.forLanguageTag("nb");

    private final ResourceBundle resourceBundle;

    @Autowired
    ResourceBundlePropertyResolver(@Value("${folder.ledetekster.path.predefined}") String predefinedQueryBundle) {

        resourceBundle = ResourceBundle.getBundle(predefinedQueryBundle, BUNDLE_LOCALE);

    }

    public Optional<String> getProperty(final String key) {

        try {
            return Optional.of(resourceBundle.getString(key));
        } catch (Throwable e) {
            LOGGER.debug("Key {} has no entry in the resource bundle. Setting to null. " +
                    "(Exception type: {}, exception message: {})", key, e.getClass().getName(), e.getMessage());
            return Optional.empty();
        }

    }

    public Optional<Integer> getIntProperty(final String key) {

        try {
            return getProperty(key).map(Integer::parseInt);
        } catch (NumberFormatException e) {
            LOGGER.error("The property {} is not convertible to a number. Ignoring", key, e);
            return Optional.empty();
        }
    }
}