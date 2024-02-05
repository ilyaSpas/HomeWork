package org.example.demorest2.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
