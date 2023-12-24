package com.example.demoWebApp.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "town")
    private String town;

    @Column(name = "date")
    private String date;

    @Column(name = "hotel")
    private String hotel;

    @Column(name = "hotelAddress")
    private String hotelAddress;

    @Column(name = "conferenceHall")
    private String conferenceHall;

}
