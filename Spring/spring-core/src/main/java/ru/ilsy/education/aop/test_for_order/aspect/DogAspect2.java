package ru.ilsy.education.aop.test_for_order.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class DogAspect2 {
    @Before("ru.ilsy.education.aop.test_for_order.aspect.pointcut.DogPointcut.anyDogsMethod()")
    public void advice1(){
        System.out.println("Advice #3");
    }
}
