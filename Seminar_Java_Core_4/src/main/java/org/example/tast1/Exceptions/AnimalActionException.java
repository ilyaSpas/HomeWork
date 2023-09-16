package org.example.tast1.Exceptions;

public abstract class AnimalActionException extends AnimalNameException{
    private int distance;
    public int getDistance(){
        return distance;
    }
    public AnimalActionException(String s, String name, int distance) {
        super(s, name);
        this.distance = distance;
    }
}
