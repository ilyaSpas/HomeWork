package org.example.set.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        /**
         * В коллекции Set нельзя достать по индексам
         * Все элементы уникальные
         * Нельзя сортировать
         * Не запоминает порядок добавления
         */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(3);
        set.add(2);
        set.add(7);
        set.add(6);

        for(int i : set){
            System.out.println(i);
        }

        System.out.println("Размер коллекции " + set.size());
    }
}
