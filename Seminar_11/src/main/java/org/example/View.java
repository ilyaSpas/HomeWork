package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class View {
    private StudentGroupsPresenter studentGroupsPresenter;
    private StudentPresenter studentPresenter;

    public void setStudentGroupsPresenter(StudentGroupsPresenter studentGroupsPresenter) {
        this.studentGroupsPresenter = studentGroupsPresenter;
    }
    public void setStudentPresenter(StudentPresenter studentPresenter) {
        this.studentPresenter = studentPresenter;
    }

    private final Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        while (true){
            System.out.println("Введите команду:\n" +
                    "1. StudentsGroup create {students_group_name}\n" +
                    "2. StudentsGroup list\n" +
                    "3. Student create {student_name} {students_group_name}\n" +
                    "4. Student list\n" +
                    "5. Students by StudentsGroup {students_group}\n" +
                    "6. Exit\n");

            String command = scanner.nextLine();

            if("Exit".equals(command)){
                System.out.println("Программа завершила свою работу.");
                break;
            }

            String[] commandArray = command.split(" ");
            String commandName = commandArray[0];
            String[] args = Arrays.copyOfRange(commandArray, 1, commandArray.length);

            if("StudentsGroup".equals(commandName)){
                // работаем с группами
                handleStudentsGroupCommand(args);
            }
            else if("Student".equals(commandName)){
                // работаем со студентами
                handleStudentCommand(args);
            }
            else if("Students".equals(commandName)){
                // поиск студентов по группе
                handleStudentsCommand(args);
            }
        }
    }
    private void handleStudentsGroupCommand(String[] args){
        if(args.length == 2){
            // создаем группу
            String groupName = args[1];
            studentGroupsPresenter.create(groupName);
        }
        else if(args.length == 1){
            // показываем список групп
            List<StudentGroup> studentGroups = studentGroupsPresenter.getAll();
            System.out.println(studentGroups);
        }
    }
    private void handleStudentCommand(String[] args){
        if(args.length == 3){
            // создаем студента в группу
            String studentName = args[1];
            String studentsGroup = args[2];
            studentPresenter.create(studentName,studentsGroup);

        }
        else if(args.length == 1){
            // показываем список всех студентов
            List<Student> students = studentPresenter.getAll();
            System.out.println(students);
        }
    }

    private void handleStudentsCommand(String[] args){
        // поиск студентов в группе
        List<Student> filteredStudents = studentPresenter.getAllByGroupName(args[2]);
    }
}
