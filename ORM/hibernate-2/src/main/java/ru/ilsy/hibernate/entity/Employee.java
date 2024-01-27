package ru.ilsy.hibernate.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.Objects;

@Entity
@Table(name = "employee", schema = "public")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = -1)
    private Long id;

    @Column(name = "name", nullable = false, length = -1)
    private String name;

    @Column(name = "age", nullable = false, length = -1)
    private int age;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "details_id", referencedColumnName = "id")
    //для каскадирования методов Hibernate
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Details details;

    @ManyToOne(cascade = CascadeType.REFRESH,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    private Department department;

    public Employee() {
    }

    // не обязательно
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", details=" + details +
               ", department=" + department +
               '}';
    }
}
