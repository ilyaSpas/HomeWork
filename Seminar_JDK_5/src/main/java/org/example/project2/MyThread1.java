package org.example.project2;

public class MyThread1 extends Thread {
    private MyProgramState state;

    public MyThread1(MyProgramState state) {
        this.state = state;
    }

    @Override
    public void run() {
        while (!state.isFinished()){
            state.setSwitcher(!state.isSwitcher());
            if(!state.isSwitcher()){
                System.out.println("Пауза");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
