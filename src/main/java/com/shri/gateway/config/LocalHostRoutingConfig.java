/*
 * Created by zeeroiq on 10/18/20, 5:12 PM
 */

package com.shri.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalHostRoutingConfig {

    @Bean
    public RouteLocator localHostRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/beer*", "/api/v1/beer/*", "/api/v1/beerUpc/*")
                        .uri("http://localhost:8080")
                        .id("beer-service"))
                .build();
    }
}
