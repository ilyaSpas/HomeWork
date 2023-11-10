package org.example.volatile_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VolatileExample volatileExample = new VolatileExample();
        volatileExample.start();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // что бы флаг running не ушел в кэш, используется volatile
        volatileExample.stopRunning();
        System.out.println("Счетчик - " + volatileExample.getCounter());
    }
}
