package org.example.tast1.Exceptions;

public class AnimalNameException extends Exception {
    private String name;
    public String getName(){
        return name;
    }
    public AnimalNameException(String s, String name) {
        super(s);
        this.name = name;
    }
}
