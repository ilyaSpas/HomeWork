package org.example;

public class Test1 {
    public static void main(String[] args) {
        try{
            foo(1, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("123");
    }

    public static void foo(int i, int j){
        System.out.println((i / j));
    }
}
