package org.example.task2;

public abstract class Product {
    protected String title;
    protected double cost;

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public Product(String title, double cost) {
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "--------------\n" +
                title + "\n" +
                "Цена: " + cost + '\n';
    }
}
