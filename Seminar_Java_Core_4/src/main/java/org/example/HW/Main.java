package org.example.HW;

import org.example.HW.MyExceptions.MyArrayDataException;
import org.example.HW.MyExceptions.MyException;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "1", "3", "1"},
                {"2", "1", "4", "1"},
                {"2", "3", "4", "1"},
                {"1", "2", "3", "g"}
        };

        try {
            foo(array);
        } catch (MyArrayDataException e) {
            System.err.println("[" + e.getX() + ";" + e.getY()+"]" + e.getMessage());
            e.printStackTrace();
        }


    }

    public static void foo(String[][] stringArray) throws MyArrayDataException {
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
