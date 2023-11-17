package org.example;

import static org.example.Utils.getRandomNumber;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int makeChoice(){
        return getRandomNumber(1,4);
    }
}
