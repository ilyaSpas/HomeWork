package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        task1(12321);

    }
    public static void task1(int num){
        String str = String.valueOf(num);
        String str1 = reverse(str);
        if (str.equals(str1)){
            System.out.println("Число является палиндром");
        }else{
            System.out.println("Число не является палиндром");
        }
    }

    public static String reverse(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; --i) {
            str1 += str.charAt(i);
        }
        return str1;
    }
}