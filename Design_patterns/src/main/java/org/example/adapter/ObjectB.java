package org.example.adapter;

public class ObjectB implements CommandForObjectB{
    @Override
    public void saveB() {
        System.out.println("save B");
    }

    @Override
    public void deleteB() {
        System.out.println("delete B");
    }
}
