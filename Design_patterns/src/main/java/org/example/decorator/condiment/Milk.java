package org.example.decorator.condiment;

import org.example.decorator.beverage.Beverage;

public class Milk extends CondimentDecorator{
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", дополнительное молоко";
    }
}
