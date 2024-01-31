package com.ilsy.spring.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firsName")
    private String firsName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "date_of_registration")
    private LocalDateTime dateOfRegistration;

    @PrePersist
    private void init(){
        dateOfRegistration = LocalDateTime.now();
        role = Role.USER;
    }
}
