package org.example.project.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.example.project.model.Weather;

@Aspect
public class WeatherAspect {
    @AfterReturning(value = "org.example.project.aspect.pointcut.WeatherPointcut.weatherMethods()", returning = "weather")
    public void weatherAdvice(Weather weather){
        System.out.println("Запрос на город " + weather.getLocation().getName());
    }
}
