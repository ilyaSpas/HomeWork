package org.example.synchronized_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new SynchronizedExample_1());
        //    list.add(new SynchronizedExample_2());
        }
        // При работе нескольких потоков с одним объектом.

        // Работа метода только в одном потоке,
        // без указания synchronized, с коллекцией работает несколько потоков одноверменно.

        // Либо необходимо использовать блок synchronized, на часть кода,
        // с указание переменной(или класса SynchronizedExample_2.class), по кoторой произойдет ошибка,
        // что избавит от возникновения исключений, но не повысит точность
        list.forEach(Thread::start);
    }
}
