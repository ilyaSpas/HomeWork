package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Employee> list = Worker.getEmployees(10);
//        for(Employee employee : list){
//            System.out.println(employee);
//        }
//
//        Collections.sort(list, new EmployeeNameComparator());
//
//        System.out.println("----------------------------------");
//
//        for(Employee employee : list){
//            System.out.println(employee);
//        }

        List<Employee> list1 = Worker.getEmployees(3);
        List<Employee> list2 = Freelancer.getFreelancers(3);
        List<Employee> list3 = foo(list1,list2);

        Collections.sort(list3, new EmployeeNameComparator());

        for (Employee employee : list3) {
            System.out.println(employee);
        }

    }
    public static List<Employee> foo(List<Employee> list1, List<Employee> list2){
        List<Employee> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        return list3;
    }
}