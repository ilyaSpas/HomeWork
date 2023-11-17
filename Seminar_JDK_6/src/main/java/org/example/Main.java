package org.example;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван");
        Level level = new Level(person);
        level.openTheDoor();
    }
}