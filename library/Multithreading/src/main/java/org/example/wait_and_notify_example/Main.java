package org.example.wait_and_notify_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BasketOfCandies basket = new BasketOfCandies();

        Child child1 = new Child(basket, "Вася");
        Child child2 = new Child(basket, "Петя");
        Child child3 = new Child(basket, "Маша");
        Mom mom = new Mom(basket);

        child1.start();
        child2.start();
        child3.start();
        mom.start();
    }
}
