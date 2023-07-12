package org.example;

public class Main {
    public static void main(String[] args) {
        Fruit fruit0 = new Apple(5);
        Fruit fruit1 = new Orange(4);
        Fruit fruit2 = new GoldenApple(3);
        Fruit fruit3 = new Orange(4);
        Fruit fruit4 = new Fruit(2);

        Basket basket0 = new Basket();
        Basket basket1 = new Basket();

        basket0.addFruit(fruit0);
        basket0.addFruit(fruit1);
        basket0.addFruit(fruit2);
        basket0.addFruit(fruit3);
        basket0.addFruit(fruit4);

        basket0.infoBasket();

        basket0.transferFruits(basket1);

        basket1.infoBasket();
        basket0.infoBasket();
    }
}