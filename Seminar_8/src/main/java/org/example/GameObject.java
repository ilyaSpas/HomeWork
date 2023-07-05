package org.example;

public class GameObject implements InfoHealth, InfoMana {
    int maxHealthPoint; // максимально количество здоровья
    int currentHealthPoint; // текущее количество здоровья

    public int maxManaPoint; // максимально количество магический энергии
    int currentManaPoint; // текущее количество магический энергии
    boolean magic;

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }
    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealthPoint;
    }

    @Override
    public int getMaximalHealth() {
        return maxHealthPoint;
    }

    @Override
    public int getCurrentMana() {
        return currentManaPoint;
    }

    @Override
    public int getMaximalMana() {
        return maxManaPoint;
    }

}
