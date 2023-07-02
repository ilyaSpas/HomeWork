package org.example;

public class Mammal extends Animal{
    public int amountOfLegs = 4;

    public Mammal(String name, double weight, int age) {
        super(name, weight, age);
        canRun = true;
        canFly = false;
        canSwim = true;
        super.appetite = 10;
    }

    @Override
    public void say() {
        System.out.println("What does fox say?!");
    }



    public int getAmountOfLegs() {
        return amountOfLegs;
    }

}
