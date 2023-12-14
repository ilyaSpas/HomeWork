package ru.ilsy.education.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.ilsy.education.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TechnoMusic implements Music {
    @Override
    public String getSong() {
        return "Boom-boom-boom";
    }

    @PostConstruct
    public void doInit(){
        System.out.println("Init");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroy");
    }
}
