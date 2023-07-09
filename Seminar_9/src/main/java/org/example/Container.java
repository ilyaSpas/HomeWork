package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Container {
    private ArrayList<Box> arrayList = new ArrayList<>();
    private int boxCounter;

    public Container() {
        boxCounter = 0;
    }

    public void addBox(Box box){
        arrayList.add(box);
        boxCounter += 1;
        System.out.println("В контейнер была добавлена коробка.");
    }

    public void getInfo(){
        System.out.println("В контейнере содержится " + boxCounter + " коробок.");
        Collections.sort(arrayList, Comparator.comparing(Box::getWeight));
        for (Box box : arrayList){
            System.out.println("Размер " + box.weight + " кг.");
        }
    }
}
