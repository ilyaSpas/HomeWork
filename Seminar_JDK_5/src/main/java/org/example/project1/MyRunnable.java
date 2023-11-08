package org.example.project1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();

        while (!thread.isInterrupted()){
            try {
                System.out.println("Tok");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток завершил свою работу.");
                break;
            }
        }
    }
}
