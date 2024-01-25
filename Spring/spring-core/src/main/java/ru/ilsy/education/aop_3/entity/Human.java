package ru.ilsy.education.aop_3.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Human {
    private String name;

    public Human() {
    }

    public String getName() {
        return name;
    }

    @Value("Jonne")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               '}';
    }
}
