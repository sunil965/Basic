package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static java.lang.System.*;

public class CalculateDateWithPeriod {
    public static void main(String[] args) {
//        LocalDate date1 = LocalDate.of(1990, 9, 05);
        LocalDate date1 = LocalDate.parse("2004-04-10", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date2 = LocalDate.now();
        Period period1 = Period.between(date1, date2);
        out.println("Date1: " + date1);
        out.println("Date2: " + date2);
        out.println("Period (date1 to date2): " + period1);
        out.println("\tYears: " + period1.getYears());
        out.println("\tMonths: " + period1.getMonths());
        out.println("\tDays: " + period1.getDays());
    }
}
