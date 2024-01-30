package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "pharmacy")
    private String pharmacy;

    @Column(name = "position")
    private String position;

    @Column(name = "pharmacy_address")
    private String pharmacyAddress;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "event_id", referencedColumnName = "id")
    private Event event;

    @Column(name = "time_of_registration")
    private LocalDateTime timeOfRegistration;

    @PrePersist
    private void init(){
        timeOfRegistration = LocalDateTime.now();
    }
}
