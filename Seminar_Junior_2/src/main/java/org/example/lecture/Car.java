package org.example.lecture;

public class Car {
    public String name;
    public String model;
    public String engModel;
    public String color;
    public int maxSpeed;

    public Car(String name) {
        this.name = name;
        this.model = "X6";
        this.engModel = "V6";
        this.color = "Black";
        this.maxSpeed = 250;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engModel='" + engModel + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
