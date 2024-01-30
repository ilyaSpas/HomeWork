package com.example.demo.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;

    @NotEmpty(message = "Необходимо ввести название города проведения мероприятия!")
    @Column(name = "town")
    private String town;

    @NotEmpty(message = "Необходимо ввести дату проведения мероприятия!")
    @Column(name = "date")
    private String date;

    @NotEmpty(message = "Необходимо ввести название отеля!")
    @Column(name = "hotel")
    private String hotel;

    @Column(name = "image_url")
    private String hotelImageUrl;

    @NotEmpty(message = "Необходимо ввести адрес проведения мероприятия!")
    @Column(name = "hotel_address")
    private String hotelAddress;

    @Column(name = "conference_hall")
    private String conferenceHall;

    @OneToMany(mappedBy = "event", fetch = FetchType.LAZY)
    private List<Participant> participants;
}
