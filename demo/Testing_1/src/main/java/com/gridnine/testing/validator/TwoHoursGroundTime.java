package com.gridnine.testing.validator;

import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;
import com.gridnine.testing.util.LocalDateTimeUtil;

import java.util.List;

public class TwoHoursGroundTime implements TwoHoursGroundTimeFlights {

    @Override
    public boolean areSegmentsCorrect(Flight flight) {
        boolean isSegmentCorrect = true;
        List<Segment> segments = flight.getSegments();
        long hours = 0;
        if (segments.size() <= 1){
            return isSegmentCorrect;
        }
        for (int i = 0; i < segments.size() - 1; i++){
            hours += LocalDateTimeUtil.getTimeBetweenFlights(segments.get(i).getArrivalDate(),
                    segments.get(i + 1).getDepartureDate());
        }
        if (hours >= 2){
            isSegmentCorrect = false;
        }
        return isSegmentCorrect;
    }


}
