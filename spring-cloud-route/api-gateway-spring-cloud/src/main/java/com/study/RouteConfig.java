package com.study;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanll-a
 * @version 1.0
 * @date 2020/12/1
 * @description
 */
@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes().route("path_hello", r->r.path("/abc/**").uri("http://localhost:8080")).build();
    }
}
