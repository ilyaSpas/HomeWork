package org.example;

import java.io.*;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ApplicationServes applicationServes = new ApplicationServes();

        while (true) {

            System.out.println("Введите данные в формате:\n" +
                    "Фамилия Имя Отчество " +
                    "Дата_рождения(10.10.2010) Номер_телефона(89151234567) Пол(F/M)");

            String str = scanner.nextLine();

            try {
                String[] personArgs = ApplicationServes.getArrayArgs(str);
                Person person = new Person(personArgs[0],personArgs[1],personArgs[2]
                        ,personArgs[3],personArgs[4],personArgs[5]);

                File file = new File("C:\\Users\\Spass\\OneDrive\\Рабочий стол\\HW\\Files\\" + personArgs[0] + ".txt");
                if (!file.exists()){
                    file.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(person.toString() + "\n");
                fileWriter.close();

            } catch (MyException | IOException e) {
                e.printStackTrace();
                continue;
            }


            System.out.println("Контакт успешно добавлен.\n");
        }
    }
}