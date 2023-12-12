package org.example;

import java.util.UUID;

@Table(name = "users")
public class Employee {

    @Column(name = "id", primaryKey = true)
    private UUID id;

    @Column(name = "name")
    private String userName;

    @Column(name = "email")
    private String email;

    public Employee(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String  getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
