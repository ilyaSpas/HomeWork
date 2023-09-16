package org.example.tast1.Exceptions;

public class AnimalSwimException extends AnimalActionException{
    public AnimalSwimException(String s, String name, int distance) {
        super(s, name, distance);
    }
}
