package org.example.set.sortedSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        /**
         * Интерфейс SortedSet, принимает компаратор
         * Уникальный
         * Сортируемый
         * Нельзя получить по индексу
         */
        SortedSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(2);
        set.add(2);
        System.out.println(set);
    }
}
