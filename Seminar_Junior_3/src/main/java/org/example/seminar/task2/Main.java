package org.example.seminar.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ToDo> toDoList = new ArrayList<>();
        toDoList.add(new ToDo("Купить хлеб"));
        toDoList.add(new ToDo("УБраться в квартире"));
        toDoList.add(new ToDo("Помыть машину"));


    }
}
