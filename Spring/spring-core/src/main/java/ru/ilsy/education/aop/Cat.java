package ru.ilsy.education.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("Meow-meow");
    }

    @Override
    public void makeMove(){
        System.out.println("Cat is moving");
    }
}
