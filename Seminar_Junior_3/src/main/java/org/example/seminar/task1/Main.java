package org.example.seminar.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("src/main/resources/test.json");
        UserData userData = new UserData("Ivan", 18, "12345");
        UserData userData1;

        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(userData);
            System.err.println("Объект сериализован.");
        }

        try (FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            userData1 = (UserData) objectInputStream.readObject();
            System.err.println("Объект десериализован.");
            System.out.println(userData1);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
