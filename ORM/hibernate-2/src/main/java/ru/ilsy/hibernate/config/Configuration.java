package ru.ilsy.hibernate.config;

import org.springframework.context.annotation.Bean;
import ru.ilsy.hibernate.util.SessionFactoryUtil;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public SessionFactoryUtil sessionFactory(){
        return new SessionFactoryUtil();
    }
}
