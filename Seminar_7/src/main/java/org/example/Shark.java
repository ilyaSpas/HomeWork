package org.example;

public class Shark extends Fish{
    public Shark(String name, double weight, int age) {
        super(name, weight, age);
        super.appetite = 15;
    }
}
