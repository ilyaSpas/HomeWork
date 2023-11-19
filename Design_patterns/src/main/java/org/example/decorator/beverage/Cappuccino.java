package org.example.decorator.beverage;

public class Cappuccino extends Beverage{
    public Cappuccino() {
        super.description = "Капучино";
    }

    @Override
    public double cost() {
        return 1.39;
    }
}
