package org.example.project1;

public class MyThread extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        while (!thread.isInterrupted()) {
            try {
                System.out.println("Tik");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток завершил свою работу.");
                break;
            }
        }
    }
}
