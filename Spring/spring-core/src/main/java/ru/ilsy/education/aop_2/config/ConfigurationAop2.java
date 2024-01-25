package ru.ilsy.education.aop_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.ilsy.education.aop_2.aspect.DogAspect;
import ru.ilsy.education.aop_2.entity.Dog;
import ru.ilsy.education.aop_2.entity.Human;

@org.springframework.context.annotation.Configuration
@EnableAspectJAutoProxy
public class ConfigurationAop2 {
    @Bean
    public Human human(){
        return new Human();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public DogAspect dogAspect(){
        return new DogAspect();
    }
}
