package com.gridnine.testing;

import com.gridnine.testing.validator.Departed;
import com.gridnine.testing.validator.DepartureBeforeArrival;
import com.gridnine.testing.validator.TwoHoursGroundTime;
import com.gridnine.testing.validator.FlightsValidator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список всех перелетов.");
        List<Flight> flights = FlightBuilder.createFlights();
        for(Flight flight : flights){
            System.out.println(flight);
        }
        System.out.println();

        System.out.println("Список перелетов, с отправление после текущего момента времени.");
        FlightsValidator flightValidator1 = new FlightsValidator(new Departed());
        List<Flight> flights1 = flightValidator1.checkFlights(flights);
        for (Flight flight : flights1) {
            System.out.println(flight);
        }
        System.out.println();

        System.out.println("Список перелетов, с вылетом до прибытия.");
        FlightsValidator flightValidator3 = new FlightsValidator(new DepartureBeforeArrival());
        List<Flight> flights3 = flightValidator3.checkFlights(flights);
        for (Flight flight : flights3) {
            System.out.println(flight);
        }
        System.out.println();

        System.out.println("Список перелетов, с пересадкой не более 2 часов.");
        FlightsValidator flightValidator2 = new FlightsValidator(new TwoHoursGroundTime());
        List<Flight> flights2 = flightValidator2.checkFlights(flights);
        for (Flight flight : flights2) {
            System.out.println(flight);
        }
    }
}