package org.example;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>(); // не должно компилироваться

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(1));
        orangeBox.add(new Orange(2));
        orangeBox.add(new Apple(2));       // не должно компилироваться
        orangeBox.add(new GoldenApple(2)); // не должно компилироваться

        System.out.println(orangeBox.getWeight()); // 3

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(2)); // допустимый вариант
        System.out.println(appleBox.getWeight()); // 3

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(5)); // допустимый вариант
        goldenAppleBox.add(new Apple(5));       // не должно компилироваться
        System.out.println(goldenAppleBox.getWeight()); // 5

        goldenAppleBox.moveTo(appleBox); // допустимый вариант
        appleBox.moveTo(goldenAppleBox); // не должно компилироваться
        orangeBox.moveTo(appleBox);      // не должно компилироваться

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println(orangeBox.getWeight()); // 0
        System.out.println(orangeBox2.getWeight()); // 3
    }
}