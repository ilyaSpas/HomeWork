package org.example.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        /**
         * Значения уникальные
         * Запоминает порядок добавления
         * Нельзя добавить по индексу
         * Нельзя сортировать
         */
        Set<String> set = new LinkedHashSet<>();
        set.add("Один");
        set.add("Два");
        set.add("Четыре");
        set.add("Три");
        set.add("Семь");
        set.add("Один");
        set.add("Один");

        System.out.println(set);
    }
}
