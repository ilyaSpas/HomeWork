package org.example;

public class Perch extends Fish{
    public Perch(String name, double weight, int age) {
        super(name, weight, age);
        super.appetite = 10;
    }
}
