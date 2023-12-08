package org.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[] {1, 2, 3, 3, 4, 2, 5, 6, 6, 3, 2, 1, 3, 5,};
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, list);

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}