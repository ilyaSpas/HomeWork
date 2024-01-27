package com.example.demorest.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class FilmPointcut {
    @Pointcut("execution(* com.example.demorest.service.FilmService.save(*))")
    public void createFilmPointcut(){}
}
