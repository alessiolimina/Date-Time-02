package it.develhope.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Start {
    public static void main(String[] args) {
        System.out.println("-------------Starting---------------------");

        LocalDateTime todaysDate = LocalDateTime.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MMMM-yy HH:mm");

        System.out.println("Today's date in my selected format: " + todaysDate.format(f1));

        ZonedDateTime zonedTodaysDate = ZonedDateTime.now();

        DateTimeFormatter f2 = DateTimeFormatter.ISO_ZONED_DATE_TIME;

        System.out.println("Today's date in ISO Zoned Date Time format: " + zonedTodaysDate.format(f2));

        System.out.println("---------------------------------------------");

        }
}
