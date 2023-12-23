package org.example.command;

public class Developer {
    private Command createCommand;
    private Command deleteCommand;
    private Command updateCommand;
    private Command selectCommand;

    public Developer(Command create, Command delete, Command update, Command select) {
        this.createCommand = create;
        this.deleteCommand = delete;
        this.updateCommand = update;
        this.selectCommand = select;
    }

    public void create(){
        createCommand.execute();
    }

    public void delete() {
        deleteCommand.execute();
    }

    public void update(){
        updateCommand.execute();
    }

    public void select(){
        selectCommand.execute();
    }
}
