package org.example.task2;

public abstract class Thing extends Product{
    private String description;

    public Thing(String title, double cost, String description) {
        super(title, cost);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Описание: " + getDescription() + '\n' +
                "--------------\n";
    }
}
