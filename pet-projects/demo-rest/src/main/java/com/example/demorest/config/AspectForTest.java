package com.example.demorest.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectForTest {
    @Before("execution(public * findAll(*))")
    public void checkAspect(){
        System.err.println("Success!");
    }
}
