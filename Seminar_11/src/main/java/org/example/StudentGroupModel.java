package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupModel {

    private ArrayList<StudentGroup> allStudentsGroups = new ArrayList<>();

    public void createStudentsGroup(String name){
        allStudentsGroups.add(new StudentGroup(name));
        System.out.println("Создана группа с названием " + name + "\n");
    }

    public ArrayList<StudentGroup> getAllStudentGroups(){
        return  allStudentsGroups;
    }

}
