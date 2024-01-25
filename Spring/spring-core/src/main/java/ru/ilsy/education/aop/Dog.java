package ru.ilsy.education.aop;

import org.springframework.stereotype.Component;

@Component
public class Dog extends  Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark-Bark");
    }

    @Override
    public void makeMove(){
        System.out.println("Dog is moving");
    }
}
