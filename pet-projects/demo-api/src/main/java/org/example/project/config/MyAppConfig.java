package org.example.project.config;

import org.example.project.aspect.WeatherAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MyAppConfig {
    @Bean
    public WeatherAspect getWeatherAspect(){
        return new WeatherAspect();
    }
}
