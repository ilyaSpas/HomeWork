package org.example.service;

public class ArithmeticService {

    public void divide(int x, int y){
        if (x == 0 || y == 0){
            throw new IllegalArgumentException();
        }
        System.out.println(x/y);
    }
}
