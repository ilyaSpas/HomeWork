package org.example.list.arrayList;

import org.example.Main;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 9 + 1));
        }

        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(3);
        Collections.sort(list);
        System.out.println(list);
        list.set(0, 2000);
        System.out.println(list);
    }
}
