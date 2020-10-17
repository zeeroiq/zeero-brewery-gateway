/*
 * Created by zeeroiq on 10/18/20, 2:45 AM
 */

package com.shri.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("google")
@Configuration
public class GoogleConfig {

    @Bean
    public RouteLocator googleRouteConfig(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/googlesearch")
                .uri("https://google.com")
                .id("google"))
                .build();
    }
}
