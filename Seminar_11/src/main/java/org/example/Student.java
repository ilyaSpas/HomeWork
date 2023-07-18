package org.example;

import java.util.Objects;
import java.util.UUID;

public class Student {

    // ========= параметры ====================
    private final UUID id;
    private String name;
    private final String groupName;

    // ========= конструктор ==================
    public Student(String name, String groupName) {
        this.groupName = groupName;
        this.id = UUID.randomUUID();
        this.name = name;
    }

    // ========= getters and setters ==========
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    // =========== equals ==================
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    // ======= hashCode =======================
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ========== toString ====================
    @Override
    public String toString() {
        return "Имя студента: " + name + "\nid - " + id + "\nГруппа - " + groupName;
    }
}
