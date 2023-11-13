package org.example.deadlock_example;

public class Friend extends Thread{
    private String name;

    public String getFriendName() {
        return name;
    }

    public Friend(String name) {
        this.name = name;
    }


    public synchronized void throwBallTo(Friend cather){
        System.out.println(name + " бросил мяч " + cather.getFriendName() + ".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        cather.throwBallTo(this);
    }

}
