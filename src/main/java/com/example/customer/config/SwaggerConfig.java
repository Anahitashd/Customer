package com.example.customer.config;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    OpenAPI appOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("My API").version("v1"));
    }
}
