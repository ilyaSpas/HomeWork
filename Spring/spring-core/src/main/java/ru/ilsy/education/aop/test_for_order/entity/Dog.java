package ru.ilsy.education.aop.test_for_order.entity;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public void makeSound(){
        System.out.println("Bark-bark!!!");
    }
}
