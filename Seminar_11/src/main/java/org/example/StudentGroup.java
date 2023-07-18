package org.example;

import java.util.Objects;
import java.util.UUID;

public class StudentGroup {

    // ========= параметры ====================
    private final UUID id;
    private String number;

    // ========= конструктор ==================
    public StudentGroup(String number) {
        this.id = UUID.randomUUID();
        this.number = number;
    }

    // ========= getters and setters ==========
    public UUID getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // =========== equals ==================
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGroup studentGroup = (StudentGroup) o;
        return Objects.equals(id, studentGroup.id);
    }

    // ======= hashCode =======================
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ========== toString ====================
    @Override
    public String toString() {
        return "Номер группы: " + number + " - UUID: " + id;
    }
}
