package org.example.hw;

import java.util.Random;

public class Philosopher extends Thread{
    private String name;
    public Philosopher(String name){
        this.name = name;
    }
    public String getPhilosopherName() {
        return name;
    }
    public static boolean getRandomBoolean(){
        return Math.random() < 0.5;
    }

    @Override
    public void run() {
        this.philosopherWish();
    }

    public void philosopherWish(){
        if (getRandomBoolean()){
            System.out.println(name + " размыщляет.");
        } else {
            System.out.println(name + " хочет есть.");
        }
    }

}
