package org.example;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        String str1 = "str1";
        String str2 = "str1";
        System.out.println(str1.compareTo(str2));

        StringBuilder sb = new StringBuilder();
    }

}

class Dog implements Cloneable {
    private int id;

    public Dog(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}