package org.example;

public class Dog extends Mammal{


    public Dog(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void say() {
        System.out.println("Bark-bark...");
    }
}
