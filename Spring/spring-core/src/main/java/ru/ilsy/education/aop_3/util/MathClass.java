package ru.ilsy.education.aop_3.util;

import org.springframework.stereotype.Component;

@Component
public class MathClass {
    public void des(int i, int j){
        System.out.println(i/j);
    }

    public int sum(int i, int j){
        return (i+j);
    }

    public int divide(int i, int j){
        return ( i / j);
    }
}
