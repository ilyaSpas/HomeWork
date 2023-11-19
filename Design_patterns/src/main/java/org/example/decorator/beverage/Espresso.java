package org.example.decorator.beverage;

public class Espresso extends Beverage{
    public Espresso() {
        super.description = "Эспрессо";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
