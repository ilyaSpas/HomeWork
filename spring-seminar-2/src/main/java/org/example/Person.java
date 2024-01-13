package org.example;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public final void sayHello(){
        System.out.println("Hello world!");
    }
}
