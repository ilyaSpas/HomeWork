package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.divide(14, 4));

        Arrays arrays = new Arrays();
        Integer[] intArray1 = {1, 2, 3, 4};
        Integer[] intArray2 = {1, 2, 3, 5};
        System.out.println(arrays.compareArrays(intArray1, intArray2));

        Pair<String, Integer> pair = new Pair<>("Один", 2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}