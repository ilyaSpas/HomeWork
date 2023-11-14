package org.example.interrup_example;

public class MyInterrupt2 extends Thread{
    private MyInterrupt1 interrupt1;

    public MyInterrupt2(MyInterrupt1 interrupt1){
        this.interrupt1 = interrupt1;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        interrupt1.interrupt();
    }
}
