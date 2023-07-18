package org.example;

public class Main {
    public static void main(String[] args) {
        Fruit fruit0 = new Apple(5);
        Fruit fruit1 = new Orange(4);
        Fruit fruit2 = new GoldenApple(3);
        Fruit fruit3 = new Orange(4);
        Fruit fruit4 = new Fruit(2);

        Box box0 = new Box();
        Box box1 = new Box();

        box0.addFruit(fruit0);
        box0.addFruit(fruit1);
        box0.addFruit(fruit2);
        box0.addFruit(fruit3);
        box0.addFruit(fruit4);

        box0.infoBox();

        box0.transferFruits(box1);

        box1.infoBox();
        box0.infoBox();
    }
}