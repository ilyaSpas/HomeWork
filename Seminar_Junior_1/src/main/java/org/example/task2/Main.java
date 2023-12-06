package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Product product = new Snacks("Lays", 50, 4, 30, 40);
        System.out.println(product.getInfo());
        Product product1 = new Inedible("Мочалка простая", 27, "Для использования в душе");
        System.out.println(product1.getInfo());
    }
}
