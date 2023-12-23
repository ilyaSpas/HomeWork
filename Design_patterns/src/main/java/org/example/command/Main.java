package org.example.command;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new CreateCommand(dataBase),
                new DeleteCommand(dataBase),
                new UpdateCommand(dataBase),
                new SelectCommand(dataBase)
        );

        developer.create();
        developer.delete();
        developer.update();
        developer.select();
    }
}
