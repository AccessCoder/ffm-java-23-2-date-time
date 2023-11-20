package de.neuefische;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2023, 8, 5);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, dd.MMMM.yyyy HH:mm");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, dd.MMMM.yyyy HH:mm:ss ZZZZ");

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(formatter.format(localDateTime));
        System.out.println(formatter2.format(localDateTime));
        System.out.println(formatter3.format(zonedDateTime));
        System.out.println(zonedDateTime);

        System.out.println(Instant.now());

        LocalDateTime ldt1 = LocalDateTime.of(2021, 1, 1, 0, 0 ,0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2023, 1, 1, 0, 0 ,0, 0);
        long days = ChronoUnit.DAYS.between(ldt1, ldt2);
        long months = ChronoUnit.MONTHS.between(ldt1, ldt2);
    }
}