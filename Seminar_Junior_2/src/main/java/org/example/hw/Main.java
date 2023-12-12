package org.example.hw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        List<Animal> list = new ArrayList<>();
        list.add(new Dog("Тузик", 7, "Двортерьер"));
        list.add(new Cat("Рыжик", 2, "Злой"));
        list.add(new Cat("Мурзик", 3, "Добрый"));
        list.add(new Dog("Рекс", 8, "Боксер"));
        list.add(new Cat("Тишка", 5, "Нейстральный"));
        list.add(new Dog("Мухтар", 5, "Хаски"));

        for(Animal animal : list){
            makeAnimalsSound(animal);
        }

        for(Animal animal : list){
            makeAnimalsInfo(animal);
        }

    }

    private static void makeAnimalsSound(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> objectClass = object.getClass();
        Method makeSound = objectClass.getDeclaredMethod("makeSound");
        makeSound.invoke(object);
    }

    private static void makeAnimalsInfo(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> objectClass = object.getClass();
        Method makeInfo = objectClass.getDeclaredMethod("getInfo");
        makeInfo.invoke(object);
    }
}
