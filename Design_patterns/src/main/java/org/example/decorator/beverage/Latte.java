package org.example.decorator.beverage;

public class Latte extends Beverage{
    public Latte() {
        super.description = "Латте";
    }

    @Override
    public double cost() {
        return 1.39;
    }
}
