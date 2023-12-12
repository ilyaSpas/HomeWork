package org.example.task2;

import java.lang.reflect.Field;

public class task2 {
    public static void main(String[] args) throws IllegalAccessException {
        Car car = new Car("Toyota", "Black", 2022);
        task2(car);
    }
    private static <T> void task2(T obj) throws IllegalAccessException {
        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            System.out.println(fields[i].getName() + ": " + fields[i].get(obj));
        }
    }
}
