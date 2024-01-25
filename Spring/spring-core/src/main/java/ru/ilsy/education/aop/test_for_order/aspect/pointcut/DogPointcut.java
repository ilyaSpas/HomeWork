package ru.ilsy.education.aop.test_for_order.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class DogPointcut {
    @Pointcut("execution(* ru.ilsy.education.aop.test_for_order.entity.Dog.*(..))")
    public void anyDogsMethod(){}
}
