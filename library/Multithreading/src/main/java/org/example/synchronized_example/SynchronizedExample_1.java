package org.example.synchronized_example;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedExample_1 extends Thread{
    private static List<Double> doubles;

    public SynchronizedExample_1(){
        doubles = new ArrayList<>();
    }

    @Override
    public void run() {
       foo();
    }

    public synchronized static void foo(){
        for (int i = 0; i < 1000000; i++) {
            doubles.add(Math.random() / Math.random());
        }
        System.out.println(doubles.size());
        doubles.clear();
    }
}
