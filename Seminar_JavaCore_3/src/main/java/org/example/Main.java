package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = Worker.getEmployees(10);
        for(Employee employee : list){
            System.out.println(employee);
        }

        Collections.sort(list, new EmployeeNameComparator());

        System.out.println("----------------------------------");

        for(Employee employee : list){
            System.out.println(employee);
        }
    }
}