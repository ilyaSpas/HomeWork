package ru.ilsy.education.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Human {
    @Value("Human")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greetPet(Animal animal){
        System.out.println("Hello " + animal.getName());
    }

    public void feedPet(Animal animal){
        System.out.println("Human feeding " + animal.getName());
    }
}
