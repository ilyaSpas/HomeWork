package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(12);
        Box box3 = new Box(7);
        Container container = new Container();
        Container container2 = new Container();

        container.addBox(box1);
        container.addBox(box2);
        container.addBox(box3);
        container2.addBox(box1);
        container2.addBox(box2);
        container.getInfo();
        container.getWeight();

        ArrayList<Container> arrayList = new ArrayList<>();
        arrayList.add(container);
        arrayList.add(container2);

        System.out.println(" ============================================== ");

        for (Container containerX : arrayList){
            containerX.getWeight();
        }
    }
}