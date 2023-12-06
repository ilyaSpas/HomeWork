package org.example.task2;

public class EdibleProduct extends Product {
    private double Proteins;
    private double Fats;
    private double Carbohydrates;

    public EdibleProduct(String title, double cost, double proteins, double fats, double carbohydrates) {
        super(title, cost);
        Proteins = proteins;
        Fats = fats;
        Carbohydrates = carbohydrates;
    }

    public double getProteins() {
        return Proteins;
    }

    public double getFats() {
        return Fats;
    }

    public double getCarbohydrates() {
        return Carbohydrates;
    }

    @Override
    public String getInfo() {
        return toString() +
                "Состав:\n" +
                "Белки - " + getProteins() + "\n" +
                "Жиры - " + getFats() + "\n" +
                "Углеводы - " + getCarbohydrates() + "\n" +
                "--------------\n";
    }
}
