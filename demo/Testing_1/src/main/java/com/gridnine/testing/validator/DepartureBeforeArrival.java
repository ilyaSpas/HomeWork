package com.gridnine.testing.validator;

import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;

public class DepartureBeforeArrival implements ArrivalTimeAfterDepartedFlights {

    @Override
    public boolean areSegmentsCorrect(Flight flight) {
        boolean isSegmentCorrect = true;
        for (Segment segment : flight.getSegments()){
            if (segment.getDepartureDate().isAfter(segment.getArrivalDate())){
                isSegmentCorrect = false;
                break;
            }
        }
        return isSegmentCorrect;
    }
}
