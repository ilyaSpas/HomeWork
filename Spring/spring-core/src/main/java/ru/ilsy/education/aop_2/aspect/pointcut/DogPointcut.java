package ru.ilsy.education.aop_2.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class DogPointcut {
    @Pointcut("execution(* ru.ilsy.education.aop_2.entity.Dog.*(..))")
    public void allDogsMethods(){}
}
