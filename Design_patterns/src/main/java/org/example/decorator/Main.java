package org.example.decorator;

import org.example.decorator.beverage.*;
import org.example.decorator.condiment.Cinnamon;
import org.example.decorator.condiment.Milk;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Cappuccino();
        System.out.println(beverage1.getDescription() + " - $" + beverage1.cost());

        beverage1 = new Cinnamon(beverage1);
        System.out.println(beverage1.getDescription() + " - $" + beverage1.cost());

        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription() + " - $" + beverage1.cost());
    }
}
