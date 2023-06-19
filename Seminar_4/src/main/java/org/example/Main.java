package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        ArrayList<String> arrayList = new ArrayList<>();

        while (!str.equals("exit")){
            System.out.println("Введите строку для добавления в коллекцию или команду(exit/revert/print): ");
            str = scanner.nextLine();

            if(str.equals("revert")){
                System.out.println("Последний элемент списка '" + arrayList.get(arrayList.toArray().length - 1).toUpperCase() + "' был удален.");
                arrayList.remove(arrayList.toArray().length - 1);
                continue;
            }
            if (str.equals("print")){
                System.out.println("В списке содержатся: ");
                Collections.reverse(arrayList);
                for(String string : arrayList){
                    System.out.println(string);
                }
                Collections.reverse(arrayList);
                continue;
            }
            arrayList.add(str);
        }
        System.out.println("Программа завершила свою работу.");

    }
}