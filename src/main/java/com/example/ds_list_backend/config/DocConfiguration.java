package com.example.ds_list_backend.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DocConfiguration
{

    @Bean
    public OpenAPI customOpenApi()
    {
        return new OpenAPI()
                .info(new Info().title("DS List API")
                        .description("Aplicação de Listagem de Jogos"));

    }
}
