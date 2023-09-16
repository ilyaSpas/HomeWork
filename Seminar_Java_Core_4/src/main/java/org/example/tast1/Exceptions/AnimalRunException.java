package org.example.tast1.Exceptions;

public class AnimalRunException extends AnimalActionException{
    public AnimalRunException(String s, String name, int distance) {
        super(s, name, distance);
    }
}
