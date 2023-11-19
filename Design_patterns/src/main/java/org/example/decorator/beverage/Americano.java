package org.example.decorator.beverage;

public class Americano extends Beverage{
    public Americano() {
        super.description = "Американо";
    }

    @Override
    public double cost() {
        return 1.19;
    }
}
