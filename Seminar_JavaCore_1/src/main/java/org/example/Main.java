package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(Decorator.decorate(Calculator.plus(1,2)));
    }
} 