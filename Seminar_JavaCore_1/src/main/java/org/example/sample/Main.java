package org.example.sample;


import org.example.regular.Calculator;
import org.example.regular.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Decorator.decorate(Calculator.plus(1,2)));
    }
} 