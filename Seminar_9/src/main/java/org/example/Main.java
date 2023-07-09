package org.example;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(12);
        Box box3 = new Box(7);
        Container container = new Container();
        container.addBox(box1);
        container.addBox(box2);
        container.addBox(box3);
        container.getInfo();
    }
}