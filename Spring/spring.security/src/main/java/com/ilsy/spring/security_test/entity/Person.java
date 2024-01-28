package com.ilsy.spring.security_test.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "year_of_birthday")
    private Long yearOfBirthday;

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(Long yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    @Override
    public String toString() {
        return "Person{" +
               "id=" + id +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               ", yearOfBirthday=" + yearOfBirthday +
               '}';
    }
}
