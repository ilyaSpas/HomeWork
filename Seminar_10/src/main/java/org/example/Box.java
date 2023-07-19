package org.example;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> arrayList = new ArrayList<>();

    public void add(T t){
        arrayList.add(t);
    }
    public int getWeight(){
        if (!arrayList.isEmpty()){
            int allWeight = 0;
            for (Fruit fruit : arrayList) {
                allWeight += fruit.getWeight();
            }
            return allWeight;
        }
        else {
            return 0;
        }
    }

    public void moveTo(Box box){
        for (Fruit fruit : this.arrayList){
            box.add(fruit);
        }
        this.arrayList.clear();
    }
}
