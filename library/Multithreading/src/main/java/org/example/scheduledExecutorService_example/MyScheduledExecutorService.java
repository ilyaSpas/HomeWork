package org.example.scheduledExecutorService_example;

import org.example.simple_threads.MyRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);
        // через сколько стартует поток
        service.schedule(() -> System.out.println("Hello world!"), 10000, TimeUnit.MILLISECONDS);
        // через сколько стартует поток, через какой промежуток его необходимо потоврить
//        service.scheduleAtFixedRate(() -> System.out.println("Hello world!"),
//                1000, 2000, TimeUnit.MILLISECONDS);
    }
}
