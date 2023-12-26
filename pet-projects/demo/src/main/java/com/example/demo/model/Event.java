package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    public Long id;

    @Column(name = "town")
    private String town;

    @Column(name = "date")
    private String date;

    @Column(name = "hotel")
    private String hotel;

    @Column(name = "image_url")
    private String hotelImageUrl;

    @Column(name = "hotel_address")
    private String hotelAddress;

    @Column(name = "conference_hall")
    private String conferenceHall;
}
