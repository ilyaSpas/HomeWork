package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Fish("Boby", 2, 10);
        animal1.say();
        Food food1 = new Greens(200);
        System.out.println(animal1.getSatiety());
    }
}