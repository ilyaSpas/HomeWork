package org.example;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Fruit> arrayList = new ArrayList<>();

    public Basket() {
    }
    public void addFruit(Fruit fruit){
        arrayList.add(fruit);
    }
    public void infoBasket(){
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

    public void transferFruits(Basket basket){
        for (Fruit fruit : this.arrayList){
            basket.addFruit(fruit);
        }
        this.arrayList.clear();
    }
}
