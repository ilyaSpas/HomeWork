package org.example.task2;

public class Thing extends Product{
    private String description;

    public Thing(String title, double cost, String description) {
        super(title, cost);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String getInfo() {
        return toString() +
                "Описание:\n" +
                getDescription() +
                "\n--------------\n";
    }
}
