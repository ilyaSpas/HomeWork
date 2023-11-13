package org.example.executor_example;

import org.example.simple_threads.MyRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(new MyRunnable());
        ((ExecutorService) executor).shutdown();
    }
}
