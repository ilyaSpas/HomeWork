package utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatter {
    private static final String PATTERN = "yyyy-MM-dd";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    public static LocalDate format(String date){
        return LocalDate.parse(date, FORMATTER);
    }

    public static boolean isValid(String date) {
        try {
            format(date);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
}
