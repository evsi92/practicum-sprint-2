package com.example.proxy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

import java.net.URI;

@Configuration
public class Config {

    @Value("${monolith.url}")
    private String monolithHost;

    @Value("${movies.service.url}")
    private String moviesHost;

    @Value("${gradual.migration}")
    private Boolean gradualMigration;

    @Value("${movie.migration.percent}")
    private Integer percent;

    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> {
                    return p.path("/api/movies")
                            .and().predicate(e -> gradualMigration)
                            .and().predicate(e ->
                            {
                                var value = Math.random() * 100;
                                System.out.println("value = " + value);
                                return value < percent;
                            })
                            .uri(moviesHost);
                })
                .route(p -> p
                        .path("/**")
                        .uri(monolithHost)
                )
                .build();
    }
}
