package com.mockito.unittesting.date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ExtractDateFromInstant {
    public static void main(String[] args) {
        // Example instant
        Instant instant = Instant.now();

        // Convert Instant to LocalDate using the system default time zone
        LocalDate localDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        // Extract day, month, and year
        int day = localDate.getDayOfMonth();
        int minthInt = localDate.getMonthValue();
        String month = localDate.getMonth().toString();
        int year = localDate.getYear();

        // Print the results
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        // Convert month to have only the first letter capitalized


        // Convert Instant to LocalDate using the system default time zone
        LocalDate localDate2 = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        // Extract day, month, and year
        int day2 = localDate.getDayOfMonth();
        String month2 = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        int year2 = localDate.getYear();

        // Convert month to have only the first letter capitalized
        String capitalizedMonth = month2.substring(0, 1).toUpperCase() + month2.substring(1).toLowerCase();

        // Print the results
        System.out.println("Day2: " + day2);
        System.out.println("Month2: " + capitalizedMonth);
        System.out.println("Year2: " + year2);


    }
}
