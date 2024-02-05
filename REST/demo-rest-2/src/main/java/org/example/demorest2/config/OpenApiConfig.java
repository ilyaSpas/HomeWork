package org.example.demorest2.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Тестовый api со списком задач",
                description = "Task list", version = "1.0.0",
                contact = @Contact(
                        name = "Ilya Spasskiy",
                        email = "spasskiy.iv@yandex.ru"
                )
        )
)
public class OpenApiConfig {
}
