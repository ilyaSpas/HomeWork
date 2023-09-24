package com.example.Electronic_questionnaires.entity;

import javax.persistence.*;

@Entity
@Table(name = "event_shp_test")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "town")
    private String town;
    @Column(name = "date_of_event")
    private String date;

    public Event() {
    }

    public Event(String town, String date) {
        this.town = town;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", town='" + town + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
