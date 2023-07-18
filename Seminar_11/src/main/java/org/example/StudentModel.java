package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class StudentModel {
    private ArrayList<Student> allStudents = new ArrayList<>();

    public void createStudent(String name, String groupName){
        allStudents.add(new Student(name, groupName));
        System.out.println("Создан студент с именем " + name + "\n");
    }

    public ArrayList<Student> getAllStudents(){
        return  allStudents;
    }

    public List<Student> getStudentsByGroupName(String groupName){
        List<Student> filteredList = new ArrayList<>();
        for (Student student : allStudents){
            if (student.getGroupName() == groupName){
                filteredList.add(student);
            }
        }
        return filteredList;
    }
}
