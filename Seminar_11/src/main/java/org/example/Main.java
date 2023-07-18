package org.example;

public class Main {
    public static void main(String[] args) {

        StudentGroupModel studentGroupModel = new StudentGroupModel();
        StudentModel studentModel = new StudentModel();
        View view = new View();
        StudentGroupsPresenter studentGroupsPresenter =
                new StudentGroupsPresenter(view, studentGroupModel);
        StudentPresenter studentPresenter =
                new StudentPresenter(view, studentModel);
        view.setStudentGroupsPresenter(studentGroupsPresenter);
        view.setStudentPresenter(studentPresenter);
        view.start();
    }
}