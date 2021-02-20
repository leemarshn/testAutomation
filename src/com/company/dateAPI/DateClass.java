package com.company.dateAPI;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * LocalDate
 * LocalTime
 * LocalDateTime
 *
 * This classes do not define public constructors
 * You will use factory methods
 *
 *
 *
 */

public class DateClass {

    public static void main(String[] args) {
//        String timeD = "2020-10-11T19:18:41.835753";

        LocalDateTime currentTime = LocalDateTime.now();
        currentTime = currentTime.plusDays(8);
        String formattedDate = currentTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT));
//        System.out.println(formattedDate);
//        String  datePattern = currentTime.format(DateTimeFormatter.ofPattern("M E d'/' y H':'mm:s a"));
////        currentTime.plusDays(5);
//        System.out.println(datePattern)
//       ;

        LocalDateTime timeNow = LocalDateTime.now();
        String tday = timeNow.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println(tday);




        //*******************************************

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM D yyyy");
//        LocalDate timeNow = LocalDate.now();
        LocalDate oda = LocalDate.parse("01 02 2015", f);

//        System.out.println(oda);

    }
}
