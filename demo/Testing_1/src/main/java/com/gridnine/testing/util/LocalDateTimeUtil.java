package com.gridnine.testing.util;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeUtil {
    public static long getTimeBetweenFlights( LocalDateTime departure, LocalDateTime arrival){
        return departure.until(arrival, ChronoUnit.HOURS);
    }
}
