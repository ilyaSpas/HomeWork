package ru.ilsy.education.aop_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.ilsy.education.aop_3.aspect.DogAspect;
import ru.ilsy.education.aop_3.aspect.MathAspect;
import ru.ilsy.education.aop_3.entity.Dog;
import ru.ilsy.education.aop_3.entity.Human;
import ru.ilsy.education.aop_3.util.MathClass;

@Configuration
@EnableAspectJAutoProxy
public class MyConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public Human human(){
        return new Human();
    }

    @Bean
    public MathClass mathClass(){return new MathClass();}

    @Bean
    public DogAspect dogAspect(){
        return new DogAspect();
    }

    @Bean
    public MathAspect mathAspect(){return new MathAspect();}
}
