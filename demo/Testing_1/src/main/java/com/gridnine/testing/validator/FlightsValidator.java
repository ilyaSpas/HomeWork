package com.gridnine.testing.validator;

import com.gridnine.testing.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightsValidator implements Validator {
    private FlightValidator flightValidator;

    public FlightsValidator(FlightValidator flightFilter) {
        this.flightValidator = flightFilter;
    }

    @Override
    public List<Flight> checkFlights(List<Flight> list){
        List<Flight> sortedFlights = new ArrayList<>();
        for (Flight flight : list) {
            if (flightValidator.areSegmentsCorrect(flight)) {
                sortedFlights.add(flight);
            }
        }
        return sortedFlights;
    }
}
