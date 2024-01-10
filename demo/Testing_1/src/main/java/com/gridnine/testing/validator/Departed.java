package com.gridnine.testing.validator;

import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;

import java.time.LocalDateTime;
import java.util.List;

public class Departed implements DepartureBeforeArrivalFlights {

    @Override
    public boolean areSegmentsCorrect(Flight flight) {
        boolean isSegmentCorrect = true;
        List<Segment> segments = flight.getSegments();
        for (Segment segment : segments){
            if (LocalDateTime.now().isAfter(segment.getDepartureDate())){
                isSegmentCorrect = false;
                break;
            }
        }
        return isSegmentCorrect;
    }
}
