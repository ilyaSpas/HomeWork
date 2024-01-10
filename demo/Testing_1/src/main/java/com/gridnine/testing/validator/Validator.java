package com.gridnine.testing.validator;

import com.gridnine.testing.Flight;

import java.util.List;

public interface Validator {
    List<Flight> checkFlights(List<Flight> flights);
}
