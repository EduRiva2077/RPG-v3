package com.tebm.v3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Global CORS configuration.
 *
 * During development the Angular dev server runs on port 4200 and the
 * Docker nginx proxy also forwards /api to port 8080.  Both origins are
 * allowed here so the same backend works in both environments.
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                        "http://localhost:4200",  // Angular dev server
                        "http://localhost:80",     // nginx (Docker)
                        "http://localhost"         // nginx without port
                )
                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}
