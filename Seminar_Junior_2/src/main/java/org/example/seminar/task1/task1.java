package org.example.seminar.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class task1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        Class<?> person = Class.forName("org.example.seminar.task1.Person");

        Constructor<?>[] constructors = person.getConstructors();
        Method[] declaredMethods = person.getDeclaredMethods();
        Field[] fields = person.getFields();

        Object object = constructors[0].newInstance();
        System.out.println(object);

//        for (int i = 0; i < declaredMethods.length; i++) {
//            System.out.println(declaredMethods[i]);
//        }
//        for (int i = 0; i < constructors.length; i++) {
//            System.out.println(constructors[i]);
//        }
//        for (int i = 0; i < fields.length; i++) {
//            System.out.println(fields[i]);
//        }

        //доступ к privete полю
        Field fieldName = person.getDeclaredField("name");
        fieldName.setAccessible(true);
        fieldName.set(object, "IVAN");

        System.out.println(object);

        //исполнить метод
        Method declaredMethod1 = declaredMethods[1];
        declaredMethod1.invoke(object);

    }
}
