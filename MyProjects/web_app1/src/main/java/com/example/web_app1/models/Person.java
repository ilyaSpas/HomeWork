package com.example.web_app1.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.time.LocalDateTime;

@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surName;
    private String fatherName;
    private String birthday;
    private String nameOfPharmacy;
    private String addressOfPharmacy;
    private String town;
    private String phoneNumber;
    private String email;
    private boolean agreement;
    private LocalDateTime dateOfAgreement;
    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;
    @PrePersist
    private void init(){
        dateOfAgreement = LocalDateTime.now();
    }

}
