package org.example.tast1.Animals;

import org.example.tast1.Exceptions.AnimalNameException;
import org.example.tast1.Exceptions.AnimalRunException;
import org.example.tast1.Exceptions.AnimalSwimException;

public abstract class Animal {
    private String name;

    /**
     * Создает новое живаотное
     *
     * @param name имя животного
     * @throws RuntimeException исключение при никорректое имя животного
     */
    public Animal(String name) throws AnimalNameException {
        if (name == null || name.length() < 3) {
            throw new AnimalNameException(name + " - имя не может быть пустым или менее 3 символов.", name);
        } else {
            this.name = name;
        }

    }

    public String getName() {
        return name;
    }

    public abstract void swim(int distance) throws AnimalSwimException;
    public abstract void run(int distance) throws AnimalRunException;
}
