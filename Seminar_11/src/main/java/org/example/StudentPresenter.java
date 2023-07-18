package org.example;

import java.util.List;

public class StudentPresenter {
    private final View view;
    private final StudentModel studentModel;

    public StudentPresenter(View view, StudentModel studentModel) {
        this.view = view;
        this.studentModel = studentModel;
    }

    public void create(String studentName, String groupName) {
        studentModel.createStudent(studentName, groupName);
    }

    public List<Student> getAll() {
        return studentModel.getAllStudents();
    }

    public List<Student> getAllByGroupName(String groupName) {
        return studentModel.getStudentsByGroupName(groupName);
    }
}
