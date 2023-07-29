package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        foo();

    }

    public static void foo(){

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nВведите число: ");
            try {
                Float number = Float.parseFloat(scanner.nextLine());
                System.out.println("Вы ввели - " + number);
            } catch (Exception e){
                System.err.println("Не верный формат, ошибка - " + e.getClass().getSimpleName());
            }
        }


    }
}