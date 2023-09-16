package org.example.HW;

import org.example.HW.MyExceptions.MyArrayDataException;
import org.example.HW.MyExceptions.MyArraySizeException;
import org.example.HW.MyExceptions.MyException;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "1", "3", "1"},
                {"2", "1", "4", "1"},
                {"2", "3", "4", "1"},
                {"1", "2", "3", "4"}
        };

        try {
            foo(array);
        } catch (MyArrayDataException e) {
            System.err.println("[" + e.getX() + ";" + e.getY()+"]" + e.getMessage());
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            System.err.println("Размер массива [" + e.getXSize() + ";" + e.getYSize() + "]");
            System.err.println("Метод принимает на вход массив 4x4");
            e.printStackTrace();
        }


    }

    public static void foo(String[][] stringArray) throws MyArrayDataException, MyArraySizeException {
        if (stringArray.length >=4 || stringArray[0].length >= 4){
            throw new MyArraySizeException("Не верный размер массива",stringArray.length, stringArray[0].length);
        }

        int counter = 0;
        int buff;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                if (!isNumber(stringArray[i][j])) {
                    throw new MyArrayDataException(" - элемент массива не является цифрой", i, j);
                }
                buff = Integer.parseInt(stringArray[i][j]);
                counter += buff;
            }
        }
        System.out.println("Сумма всех чисел массива - " + counter);
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
