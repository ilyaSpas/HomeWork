package org.example.list.vector;

import java.util.List;
import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        List<Thread> list = new Vector();
        for (int i = 0; i < 10; i++) {
            list.add(new Thread(() -> {
                System.out.println("Hello world!");
            }));
        }
        list.forEach(Thread::start);
    }
}
