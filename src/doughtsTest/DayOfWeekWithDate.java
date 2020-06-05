package doughtsTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static java.lang.System.out;

public class DayOfWeekWithDate {

    public static void main(String... arg){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        out.printf("Day with Date & Calender Class: %d for date %s%n", calendar.get(Calendar.DAY_OF_WEEK), date);

        Locale locale = new Locale("india");
        DateFormat dateFormat = new SimpleDateFormat("EEEE", locale);
        out.printf("Day with Date & DateFormat class: %s for date %s%n", dateFormat.format(date), date);

        LocalDate localDate =  LocalDate.of(1990,9,6);
        DayOfWeek day = localDate.getDayOfWeek();
        out.println("Day with LocalDate & DayOfWeek class: "+day.getValue()+ " for date "+date);
        out.println("Day with LocalDate & DayOfWeek class: "+day.getDisplayName(TextStyle.FULL,locale)+ " for date "+localDate);

    }
}
