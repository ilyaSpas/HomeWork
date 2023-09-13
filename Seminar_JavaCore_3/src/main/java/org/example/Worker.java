package org.example;

import java.util.ArrayList;
import java.util.List;

public class Worker extends Employee {
    private Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public static Employee getInstance() {
        return new Worker(
                names[random.nextInt(names.length)],
                surNames[random.nextInt(surNames.length)],
                random.nextInt(30000, 250000));
    }
    public static List<Employee> getEmployees(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++){
            employees.add(getInstance());
        }
        return employees;
    }

    @Override
    public String toString() {
        return "Работник. Имя: " + getName() + " " + getSurName() + ". ЗП - " + salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
}
