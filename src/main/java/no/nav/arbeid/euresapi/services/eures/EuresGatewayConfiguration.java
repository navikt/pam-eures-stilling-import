package no.nav.arbeid.euresapi.services.eures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Configuration
class EuresGatewayConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(EuresGateway.class);

    @Value("${shouldUseProxy}")
    private boolean shouldUseProxy;

    @Value("${ProxyUrlHostName}")
    private String proxyUrlHostName;

    @Value("${ProxyUrlPort}")
    private Integer proxyUrlPort;

    @Value("${ProxyUrlScheme}")
    private String proxyUrlScheme;

    @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setRequestFactory(simpleClientHttpRequestFactory());
        return restTemplate;
    }



    private SimpleClientHttpRequestFactory simpleClientHttpRequestFactory() {

        final SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();

        if (shouldUseProxy) {
            simpleClientHttpRequestFactory.setProxy(proxy());
        }

        return simpleClientHttpRequestFactory;
    }

    private Proxy proxy() {
        final Proxy.Type proxyType = Proxy.Type.valueOf(proxyUrlScheme);

        LOGGER.debug("Proxy _should_ be used, and it is set to: \"{}\"", proxyUrlHostName);

        return new Proxy(proxyType, new InetSocketAddress(proxyUrlHostName, proxyUrlPort));
    }


}
