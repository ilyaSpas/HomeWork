package com.example.web_app1.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String town;
    private String dateOfEvent;
    private LocalDateTime dateOfCreate;
    @OneToMany(mappedBy = "event")
    private List<Person> personList;
    @PrePersist
    private void init(){
        dateOfCreate = LocalDateTime.now();
        personList = new ArrayList<>();
    }
}

