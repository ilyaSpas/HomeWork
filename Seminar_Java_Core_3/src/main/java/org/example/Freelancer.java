package org.example;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends Employee{

    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    public static Employee getInstance() {
        return new Freelancer(
                names[random.nextInt(names.length)],
                surNames[random.nextInt(surNames.length)],
                random.nextInt(30000, 250000));
    }

    public static List<Employee> getFreelancers(int count){
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++){
            employees.add(getInstance());
        }
        return employees;
    }
    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }

    @Override
    public String toString() {
        return "Фрилансер. Имя: " + getName() + " " + getSurName() + ". ЗП - " + salary;
    }
}
