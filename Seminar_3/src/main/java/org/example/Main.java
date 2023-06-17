package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int j = (int) (1 + 100 * Math.random());
            arrayList.add(j);
        }

        for (Integer k : arrayList) {
            System.out.print(k + " ");
        }
        System.out.println("\n");


    }


    // 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
    public static ArrayList<Integer> task1(ArrayList<Integer> arrayList) {
        arrayList.removeIf(l -> l % 2 == 0);
        return arrayList;
    }


    // 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
    public static int task2(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.toArray().length; i ++) {
            if (arrayList.get(i) < min) {
                min = i;
            }
        }
        return min;
    }


    // 3) Найти максимальное значение
    public static int task3(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.toArray().length; i ++) {
            if (arrayList.get(i) > max) {
                max = i;
            }
        }
        return max;
    }


    // 4) Найти среднее значение
    public static int task4(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int l = 0; l < arrayList.toArray().length; l++){
            sum = arrayList.get(l) + sum;
        }
        return sum / arrayList.toArray().length;
    }

}