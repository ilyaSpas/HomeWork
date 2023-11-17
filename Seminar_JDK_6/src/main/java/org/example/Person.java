package org.example;

import static org.example.Utils.getRandomNumber;

public class Person {
    private String name;
    private int roundWin;
    private int roundLose;

    public Person(String name) {
        this.name = name;
        roundWin = 0;
        roundLose = 0;
    }

    public String getName() {
        return name;
    }

    public int getRoundWin() {
        return roundWin;
    }

    public int getRoundLose() {
        return roundLose;
    }

    public int makeChoice() {
        return getRandomNumber(1, 4);
    }

    public void win() {
        roundWin++;
    }

    public void lose() {
        roundLose++;
    }
}
