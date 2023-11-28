package org.example;

import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 6, 7, 5, 34, 65, 33, 2, 22));
        System.out.println("Average - " + foo(list));
    }

    public static double foo(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToDouble(a -> a)
                .average()
                .orElse(0);
    }
}