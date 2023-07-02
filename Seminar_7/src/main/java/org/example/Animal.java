package org.example;

public abstract class Animal {
    public String name;
    public int age;
    public double weight;
    public int appetite;
    public int satiety = 50;


    public boolean canRun;
    public boolean canFly;
    public boolean canSwim;

    public abstract void say();
    public void eat(Food food){
        food.setAmount(food.getAmount() - appetite);
        satiety += appetite;
    }

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = age;
    }
}
