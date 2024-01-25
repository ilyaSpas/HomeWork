package ru.ilsy.education.aop_3.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Dog {
    @Value("Jack")
    private String name;

    private Human owner;

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Bark-bark!!!");
    }
}
