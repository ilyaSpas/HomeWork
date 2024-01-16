package com.example.demo.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class DateParserUtil {
    private final DateTimeFormatter localDateTimeToTime = DateTimeFormatter.ofPattern("HH:mm:ss");
    private final DateTimeFormatter dateParser = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static String parseDateToTime(LocalDateTime date) {
        if (date != null) {
            return date.format(localDateTimeToTime);
        }
        return null;
    }

    public static String parseDate(LocalDate date) {
        if (date != null) {
            return date.format(dateParser);
        }
        return null;
    }
}
