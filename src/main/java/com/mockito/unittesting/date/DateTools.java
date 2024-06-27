package com.mockito.unittesting.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTools {

    public static void main(String[] args) {
        System.out.println(String.valueOf(ZonedDateTime.now(ZoneId.of("America/New_York")).getYear()));

        System.out.println(String.valueOf(ZonedDateTime.now(ZoneId.of("America/New_York"))));

        System.out.println(ZoneId.of("America/New_York"));
    }
}
