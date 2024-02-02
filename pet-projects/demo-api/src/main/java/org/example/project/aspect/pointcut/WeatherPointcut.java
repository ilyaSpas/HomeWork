package org.example.project.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class WeatherPointcut {
    @Pointcut("execution(* org.example.project.service.WeatherService.getWeather(..))")
    public void weatherMethods(){}
}
