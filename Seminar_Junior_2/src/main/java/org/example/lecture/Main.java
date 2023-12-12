package org.example.lecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> car = Class.forName("org.example.lecture.Car");
        Constructor<?>[] constructors = car.getConstructors();

        Object object = constructors[0].newInstance("BMW");

        System.out.println(object);

        Field[] fields = object.getClass().getFields();
        fields[fields.length - 1].setInt(object, 300);

        System.out.println(object);

        Method[] methods = object.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}