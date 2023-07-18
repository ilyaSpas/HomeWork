package org.example;

import java.util.List;

public class StudentGroupsPresenter {
    private final View view;
    private final StudentGroupModel studentGroupModel;

    public StudentGroupsPresenter(View view, StudentGroupModel studentGroupModel) {
        this.view = view;
        this.studentGroupModel = studentGroupModel;
    }

    public void create(String groupName) {
        studentGroupModel.createStudentsGroup(groupName);
    }

    public List<StudentGroup> getAll() {
        return studentGroupModel.getAllStudentGroups();
    }
}
