package org.example.tast1.Animals;

import org.example.tast1.Exceptions.AnimalNameException;
import org.example.tast1.Exceptions.AnimalRunException;
import org.example.tast1.Exceptions.AnimalSwimException;

public class Cat extends Animal{
    /**
     * Создает новое живаотное
     *
     * @param name имя животного
     * @throws RuntimeException исключение при никорректое имя животного
     */
    public Cat(String name) throws AnimalNameException {
        super(name);
    }

    @Override
    public void swim(int distance) throws AnimalSwimException {
        throw new AnimalSwimException("Кошки не умеют плавать",getName(),distance);
    }

    @Override
    public void run(int distance) throws AnimalRunException {
        if (distance <= 50){
            System.out.println(getName() + " бежит " + distance + " метров.");
        }
        else {
            throw new AnimalRunException( distance + " - cлишком большая дистанция для одного забега", getName(), distance);
        }
    }
}
