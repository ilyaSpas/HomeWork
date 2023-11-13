package org.example.callable_example;

import org.example.Main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Callable_example {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // создается интерфей коллайбл
        Callable callable = () -> {
            double j = 0;
            for (int i = 0; i < 20; i++) {
                j += Math.random() * 10;
            }
            return j;
        };

        // создается фьючертакс, с параметром коллайбл
        FutureTask<Double> futureTask = new FutureTask<>(callable);

        // создается и запускается поток, с папраметром фьючертакс
        new Thread(futureTask).start();

        // результат получается с помощью метода get()
        System.out.println(futureTask.get());
    }
}
