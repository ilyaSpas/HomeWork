package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Fish("Boby", 2, 3);
        Animal animal2 = new Bird("Boby", 0.1, 1);
        Animal animal3 = new Cat("Boby", 3, 4);
        Animal animal4 = new Dog("Boby", 5, 5);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for(Animal i : animals){
            i.say();
        }
    }
}