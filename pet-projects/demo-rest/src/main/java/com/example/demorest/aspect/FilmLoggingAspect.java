package com.example.demorest.aspect;

import com.example.demorest.dto.FilmDto;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.time.LocalDateTime;

@Aspect
public class FilmLoggingAspect {
    @AfterReturning("com.example.demorest.aspect.pointcut.FilmPointcut.createFilmPointcut()")
    public void loggingFileAdvice(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        if (args[0] != null){
            FilmDto filmDto = (FilmDto) args[0];
            System.out.println(LocalDateTime.now() + " Logging_film_advice: created new film: " + filmDto.getTitle());
        }


    }
}
