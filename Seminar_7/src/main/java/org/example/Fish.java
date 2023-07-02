package org.example;

public class Fish extends Animal {
    public int amountOfFins = 7;

    public Fish(String name, double weight, int age) {
        super(name, weight, age);
        canRun = false;
        canFly = false;
        canSwim = true;
        super.appetite = 3;
    }

    @Override
    public void say() {
        System.out.println("O-o-o-o-o-o...");
    }


    public int getAmountOfFins() {
        return amountOfFins;
    }

    public void setAmountOfFins(int amountOfFins) {
        this.amountOfFins = amountOfFins;
    }
}
