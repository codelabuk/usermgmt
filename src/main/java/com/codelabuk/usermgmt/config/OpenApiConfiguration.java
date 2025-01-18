package com.codelabuk.usermgmt.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("User Management API")
                        .description("User Management Application API"))
                ;
    }

    @Bean
    public GroupedOpenApi customGroup() {
        return GroupedOpenApi.builder().group("UserManagement")
                        .pathsToMatch("/api/**").build();
    }

}
