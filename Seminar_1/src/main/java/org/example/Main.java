package org.example;

public class Main {
    public static void main(String[] args) {

//        System.out.println(isSumBetween10And20(10,5));
//        System.out.println(isPositive(5));
//        printString("Hello, world!", 3);
//        System.out.println(isLeapYear(200));
//        int[] array = createArray(4,2);
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//        int[] array = {1,0,0,0,0,1};
//        int[] array2 = task1(array);
//        for (int i = 0; i < array2.length; i++){
//            System.out.print(array2[i] + " ");
//        }
//        int[] array = {2,4,8,3,7,9,3,8,9};
//        int[] array2 = task2(array);
//        for (int i = 0; i < array2.length; i++){
//            System.out.print(array2[i] + " ");
//        }

        // a - размер квадратной матрицы
//        task3(7);




    }
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        if((a + b) < 20 && (a + b) > 10) {return true;}
        else { return false; }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0){ return true; }
        else { return false; }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for(int i = 0; i < repeat; i++){
            System.out.println(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if(year % 4 == 0) { return true; }
        else { return false; }
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }

    private static int[] task1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    private static int[] task2(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        return array;
    }

    private static void task3(int a){
        int[][] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            array[i][array.length - i - 1] = 1;
        }

        for(int i = 0; i < array.length; i++ ){
            for(int j = 0; j < array.length; j++ ){
                if(i == j){
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }





/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 *
 * 4. Подготовить вопросы к следующему уроку.
 */

}