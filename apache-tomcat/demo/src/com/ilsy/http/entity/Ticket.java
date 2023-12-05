package com.ilsy.http.entity;

import java.util.Objects;

public class Ticket {
    private Long id;
    private String passangerNo;
    private String passangerName;
    private Long flightNo;
    private String seatNo;
    private double cost;

    public Ticket(Long id, String passangerNo, String passangerName, Long flightNo, String seatNo, double cost) {
        this.id = id;
        this.passangerNo = passangerNo;
        this.passangerName = passangerName;
        this.flightNo = flightNo;
        this.seatNo = seatNo;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassangerNo() {
        return passangerNo;
    }

    public void setPassangerNo(String passangerNo) {
        this.passangerNo = passangerNo;
    }

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public Long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(Long flightNo) {
        this.flightNo = flightNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(passangerNo, ticket.passangerNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passangerNo);
    }

    @Override
    public String toString() {
        return "Ticket{" +
               "id=" + id +
               ", passangerNo='" + passangerNo + '\'' +
               ", passangerName='" + passangerName + '\'' +
               ", flightNo=" + flightNo +
               ", seatNo='" + seatNo + '\'' +
               ", cost=" + cost +
               '}';
    }
}
