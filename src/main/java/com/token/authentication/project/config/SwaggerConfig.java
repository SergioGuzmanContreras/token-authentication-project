package com.token.authentication.project.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${swagger.server.url}")
    private String environment;

    @Bean
    public OpenAPI OpenAPIDoc() {
        return new OpenAPI()
                .addServersItem(new Server().description("Server").url(this.environment))
                .components(
                        new Components().addSecuritySchemes("bearer-jwt",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer").bearerFormat("JWT")
                                        .in(SecurityScheme.In.HEADER).name("Authorization")))
                .info(new Info().title("Test API Token Authentication")
                        .description("API documentation of test api token Project")
                        .version("1.0")
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Powered with <3 by test")
                        .url("https://www.test-api.mx/"));
    }

}
