package org.example;

public class Cat extends Mammal{


    public Cat(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void say() {
        System.out.println("Meow-meow...");
    }
}
