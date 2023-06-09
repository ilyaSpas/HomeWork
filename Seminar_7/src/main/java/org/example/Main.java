package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Fish("Boby", 2, 3);
        Animal animal2 = new Bird("Dilun", 0.1, 1);
        Animal animal3 = new Cat("Mikle", 3, 4);
        Animal animal4 = new Dog("Daymond", 5, 5);

        Food food = new Meet(300);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);

        for(Animal i : animals){
            i.say();
            i.eat(food);
        }
    }
}