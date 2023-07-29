package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        //foo1();
        //foo4();

//        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
//        int d = 1;
//        try {
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.err.println("Catching: " + e.getClass().getSimpleName() +
//                    "\nНа ноль делить нельзя.");
//        } catch (IndexOutOfBoundsException e){
//            System.err.println("Catching: " + e.getClass().getSimpleName() +
//                    "\nИндекс вне рам массива.");
//        }


//        int a = 90;
//        int b = 3;
//        try {
//            System.out.println(a / b);
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//            System.err.println("На ноль делить нельзя!");
//        }

//        printSum(23, 234);

//        int[] abc = { 1, 2 };
//        try {
//            abc[3] = 9;
//        } catch (IndexOutOfBoundsException ex) {
//            ex.printStackTrace();
//            System.err.println("Массив выходит за пределы своего размера!");
//        }



    }

    public static void foo1(){
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


    public static void foo4() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        if (str.isEmpty()){
            throw new Exception("Строка пустая!");
        }
        System.out.println("Вы ввели: " + str);
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

}