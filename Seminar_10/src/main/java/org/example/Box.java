package org.example;

import java.util.ArrayList;

public class Box {
    public ArrayList<Fruit> arrayList = new ArrayList<>();

    public Box() {
    }
    public void addFruit(Fruit fruit){
        arrayList.add(fruit);
    }
    public void infoBox(){
        if (!arrayList.isEmpty()){
            int allWeight = 0;
            for (Fruit fruit : arrayList) {
                allWeight += fruit.getWeight();
                System.out.println("Вес фрукта " + fruit.getWeight() + " кг.");
            }
            System.out.println("Общий вес корзины с фруктами " + allWeight + " кг.");
        }
        else {
            System.out.println("Корзина пуста.");
        }
    }

    public void transferFruits(Box box){
        for (Fruit fruit : this.arrayList){
            box.addFruit(fruit);
        }
        this.arrayList.clear();
    }
}
