package org.example;

public class Employee {
    private String name;
    private String surName;
    private double salary;
    public double calculateSalary(){
        return salary;
    }
    public Employee(String name, String surName, double salary){
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
