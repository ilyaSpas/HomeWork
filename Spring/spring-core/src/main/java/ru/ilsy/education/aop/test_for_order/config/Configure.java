package ru.ilsy.education.aop.test_for_order.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ru.ilsy.education.aop.test_for_order.aspect.DogAspect;
import ru.ilsy.education.aop.test_for_order.aspect.DogAspect1;
import ru.ilsy.education.aop.test_for_order.aspect.DogAspect2;
import ru.ilsy.education.aop.test_for_order.entity.Dog;

@Configuration
@EnableAspectJAutoProxy
public class Configure {
    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public DogAspect dogAspect(){
        return new  DogAspect();
    }

    @Bean
    public DogAspect1 dogAspect1(){
        return new  DogAspect1();
    }

    @Bean
    public DogAspect2 dogAspect2(){
        return new DogAspect2();
    }
}
