package org.example;

public class ApplicationServes {
    public static String[] getArrayArgs(String str) throws MyException{
        String args[] = str.split(" ");
        if (args.length !=6 ){
            throw new MyException("Не верное количество аргументов.");
        }
        return args;
    }
}
