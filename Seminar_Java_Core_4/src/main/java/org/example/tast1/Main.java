package org.example.tast1;

import org.example.tast1.Animals.Animal;
import org.example.tast1.Exceptions.AnimalNameException;
import org.example.tast1.Animals.Cat;

import java.util.Random;

public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {

        try {

            Animal cat1 = new Cat("Паффи");
            Animal cat2 = new Cat("Борис");

            Animal[] animals = new Animal[] {cat1,cat2};

            for (Animal animal : animals){

                for (int i = 0; i < 10; i++){

                    int k = random.nextInt(2);
                    try {
                        switch (k){
                            case 0 -> {
                                animal.swim( i * 10);
                            }
                            case 1 -> {
                                animal.run(i * 10);
                            }
                        }
                    } catch (AnimalNameException e){
                        System.err.println(e.getMessage());
                    }

                }

            }

        } catch (AnimalNameException e) {
            System.out.println(e.getMessage());
        }


    }
}