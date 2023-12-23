package org.example.command;

public class CreateCommand implements Command{
    private DataBase dataBase;

    public CreateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.create();
    }
}
