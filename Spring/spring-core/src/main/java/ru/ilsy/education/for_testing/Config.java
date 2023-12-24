package ru.ilsy.education.for_testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
@ComponentScan("ru.ilsy.education.for_testing")
public class Config {
//    @Bean
//    public Bean2 bean2(){
//        return new Bean2();
//    }
//
//    @Bean
//    public Test testBean(){
//        return new Test(bean2());
//    }
}
