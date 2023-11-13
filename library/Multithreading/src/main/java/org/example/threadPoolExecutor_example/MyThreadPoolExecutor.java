package org.example.threadPoolExecutor_example;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        // количество поток в пуле
        executor.setCorePoolSize(6);
        // максимальное количество потоков в пуле
        executor.setMaximumPoolSize(7);
        // размер очереди потоков
        executor.getQueue().size();
    }
}
