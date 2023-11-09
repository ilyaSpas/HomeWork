package org.example.project2;

public class Main {
    public static void main(String[] args) {
        MyProgramState state = new MyProgramState();

        MyThread1 thread1 = new MyThread1(state);
        MyThread2 thread2 = new MyThread2(state);

        thread1.start();
        thread2.start();
    }
}
