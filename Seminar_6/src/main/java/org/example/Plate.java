package org.example;

public class Plate {
    // ============== параметры =====================
    private int food;

    // ============== конструктор ===================
    public Plate(int food) {
        this.food = food;
    }
    public Plate() {
        this(100);
    }

    // ============== геттеры и сеттеры =============
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }

    // ============== методы ========================
    public void increaseFood(int food){
        if (food > 0) {
            this.food += food;
        }
    }
    public boolean decreaseFood(int food){
        if (this.food >= food) {
            this.food -= food;
            return true;
        }
        return false;
    }

    // ============== to String =====================
    @Override
    public String toString() {
        return "В тарелке сейчас " + food + " единиц еды";
    }
}
