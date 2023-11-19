package org.example.decorator.condiment;

import org.example.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
