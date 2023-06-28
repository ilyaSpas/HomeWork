package org.example;

import java.util.Objects;

public class Cat {
    // ============== параметры =====================
    private String name;
    private int appetite;
    private boolean satiety;
    private int hungry;

    // ============== конструктор ===================
    public Cat(String name, int appetite, int hungry) {
        this.hungry = hungry;
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    // ============== геттеры и сеттеры =============
    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public int getAppetite() { return appetite; }
    public void setAppetite(int appetite) { this.appetite = appetite; }
    public boolean isSatiety() { return satiety; }
    public void setSatiety(boolean satiety) { this.satiety = satiety; }
    public int getHungry() { return hungry; }
    public void setHungry(int hungry) { this.hungry = hungry; }

    // ============== методы =======================
    public void eat(Plate plate){
        if (plate.getFood() < appetite*hungry){
            plate.setFood(0);
            System.out.println("Коту не хватит корма.");
            return;
        }
        if (plate.getFood() >= appetite*hungry) {
            if (satiety){
                System.out.println("Кот не голоден.");
            }
            if (!satiety) {
                plate.decreaseFood(appetite * hungry);
                satiety = true;
            }
        }
    }

    // ============== to String ====================
    @Override
    public String toString() {
        String sat;
        if (satiety){
            sat = ", он сыт.";
        }
        else {
            sat = ", он голоден.";
        }
        return "Кота зовут " + name +
                ", его аппетит " + appetite + " и голод - " + hungry +
                sat;
    }

    // ============== equals && hashCode ===========
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
