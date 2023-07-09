package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Container implements Comparable<Container> {
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

    public int getWeight(){
        int containerWeight = 0;
        for (Box box : arrayList){
            containerWeight += box.getWeight();
        }
        System.out.println("Общий вес контейнера " + containerWeight + " кг.");
        return containerWeight;
    }


    @Override
    public int compareTo(Container container) {
        if(getWeight() > container.getWeight()){
            return 1;
        }
        if(getWeight() < container.getWeight()){
            return -1;
        }
        return 0;
    }
}
