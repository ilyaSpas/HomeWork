package org.example;

import java.util.Random;

public abstract class Employee implements Comparable<Employee> {

    //region Static fields
    protected static String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    protected static String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
    protected static Random random = new Random();
    public static int counter = 1000;
    private int id;
    //endregion

    //region Fields
    private String name;
    private String surName;
    protected double salary;
    //endregion


    // инициализатор
    {
        id = ++counter;
    }
    //region Constructors
    protected Employee() {
        this("#Name#", "#SurName#");
    }

    protected Employee(String name, String surName) {
        this("#Name#", "#SurName#", 500);
    }

    protected Employee(String name, String surName, double salary) {
        if (salary < 500) {
            throw new RuntimeException("Ставка не должна быть менее 500 рублей в час.");
        }
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }
    //endregion

//    public static Employee getInstance(){
//        return new Employee(names[random.nextInt(names.length)],
//                surNames[random.nextInt(surNames.length)],
//                random.nextInt(30000, 250000));
//    }

    public abstract double calculateSalary();

    //region Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 30_000) {
            throw new RuntimeException("Уровень ЗП не должен быть менее 30.000 рублей");
        }
        this.salary = salary;
    }
    //endregion

    //region toSring

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

    //endregion
}
