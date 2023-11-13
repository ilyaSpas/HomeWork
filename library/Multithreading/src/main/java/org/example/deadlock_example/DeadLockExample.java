package org.example.deadlock_example;

public class DeadLockExample {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Вася");
        Friend friend2 = new Friend("Катя");

        new Thread(() -> {
            friend1.throwBallTo(friend2);
        }).start();

        new Thread(() -> {
            friend2.throwBallTo(friend1);
        }).start();


    }
}
