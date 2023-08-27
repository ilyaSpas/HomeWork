package org.example;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        MyThread2 myThread2 = new MyThread2();
//        myThread.start();
//        myThread2.start();
        System.out.println("");

    }

    static class MyThread extends Thread{
        public void run(){
            for (int i = 0; i < 100 ; i++) {
                System.out.println("0000 " + i);
            }
        }
    }
    static class MyThread2 extends Thread{
        public void run(){
            for (int i = 0; i < 100 ; i++) {
                System.out.println("++++ " + i);
            }
        }
    }

}