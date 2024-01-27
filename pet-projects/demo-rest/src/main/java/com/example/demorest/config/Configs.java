package com.example.demorest.config;

import com.example.demorest.aspect.FilmLoggingAspect;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Configs {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public FilmLoggingAspect filmLoggingAspect(){
        return new FilmLoggingAspect();
    }
}
