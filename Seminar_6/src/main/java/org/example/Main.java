package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Murzik", 10, 10);
        System.out.println(cat1);

        Plate plate2 = new Plate(200);
        System.out.println(plate2);

        cat1.eat(plate2);
        System.out.println(cat1);
        System.out.println(plate2);
    }
}