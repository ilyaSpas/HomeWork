package ru.ilsy.education.Test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Cat getCat(){
        return new Cat();
    }

    @Bean
    @Scope("prototype")
    public Dot getDot(){
        return new Dot();
    }
}
