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
            System.out.println("\n    Информация о корзине:");
            for (Fruit fruit : arrayList) {
                allWeight += fruit.getWeight();
                System.out.println("Фрукт " + fruit.getClass().toString()
                        .substring(18).toUpperCase() +
                        ", вес " + fruit.getWeight() + " кг.");
            }
            System.out.println("==================================\n" +
                    "Общий вес корзины с фруктами " + allWeight + " кг.\n");
            return allWeight;
        }
        else {
            System.out.println("Корзина пуста.");
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
