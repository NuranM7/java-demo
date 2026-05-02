package dev.lpa;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class MainDateAndTime {

    static void main() {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate Two2 = LocalDate.of(2026, 2, 2);
        System.out.println(Two2);

        LocalDate May5th = LocalDate.of(2026, Month.MAY, 5);
        System.out.println(May5th);

        LocalDate Day125 = LocalDate.ofYearDay(2026, 125);
        System.out.println(Day125);

        LocalDate May5 = LocalDate.parse("2026-05-05");
        System.out.println(May5);

        System.out.println(May5.getYear());
        System.out.println(May5.getMonth());

        System.out.println(May5.getMonthValue());

        System.out.println(May5.getDayOfMonth());
        System.out.println(May5.getDayOfWeek());
        System.out.println(May5.getDayOfYear());

        System.out.println(May5.get(ChronoField.YEAR));
        System.out.println(May5.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(May5.get(ChronoField.DAY_OF_MONTH));
        System.out.println(May5.get(ChronoField.DAY_OF_YEAR));

        System.out.println(May5.withYear(2000));
        System.out.println(May5.withMonth(3));
        System.out.println(May5.withDayOfMonth(4));
        System.out.println(May5.withDayOfYear(126));
        System.out.println(May5);
        System.out.println(May5.with(ChronoField.DAY_OF_YEAR, 126));



    }
}
