package org.example;

public class Bird extends Animal{
    public int amountOfWings = 2;

    public Bird(String name, double weight, int age) {
        super(name, weight, age);
        canRun = false;
        canFly = true;
        canSwim = true;
        super.appetite = 5;
    }

    @Override
    public void say() {
        System.out.println("Chik-chik...");
    }



    public int getAmountOfWings() {
        return amountOfWings;
    }

}
