package org.example.seminar.task2;

import java.io.Serializable;

public class ToDoV1 implements Serializable {

    private String title;

    private boolean isDone;

    public ToDoV1() {
    }

    public ToDoV1(String title) {
        this.title = title;
        this.isDone = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "ToDoV1{" +
                "title='" + title + '\'' +
                ", isDone=" + isDone +
                '}';
    }
}
