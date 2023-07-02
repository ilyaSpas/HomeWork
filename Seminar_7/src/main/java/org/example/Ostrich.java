package org.example;

public class Ostrich extends Bird{

    public Ostrich(String name, double weight, int age) {
        super(name, weight, age);
        canRun = true;
        canFly = false;
        canSwim = false;
        super.appetite = 10;
    }

    @Override
    public void say() {
        System.out.println("Cheeee...");
    }
}
