package org.example.project2;

public class MyThread2 extends Thread{
    private MyProgramState state;
    public MyThread2(MyProgramState state){
        this.state = state;
    }
    @Override
    public void run() {
        int i = 100;
        while (!state.isFinished() && i > 0){
            if (state.isSwitcher()){
                System.out.println(i);
                i--;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        state.setFinished(true);
    }
}
