package org.example.decorator.condiment;

import org.example.decorator.beverage.Beverage;

public class Cinnamon extends CondimentDecorator{
    private Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.19 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.description + ", корица";
    }
}
