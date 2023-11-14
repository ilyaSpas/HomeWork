package org.example.examples;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main1 {
    public static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            String str;
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
                cnt++;
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Введено " + cnt + " сообщений.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

    }
}