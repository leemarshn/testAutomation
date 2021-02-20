package com.company.dateAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RealDateClass {
    public static void main(String[] args) {
        LocalDate date_today = LocalDate.now();
        LocalTime time_now = LocalTime.now();
        LocalDateTime time_date = LocalDateTime.now();


        /**
         * LocalDate or LocalDateTime
         * -> getYear()
         * -> getMonth()
         * -> getDayOfWeek() | year \ month
         */
        int getYear = date_today.getYear();
        /** LocalTime or LocalDateTime
         * -> getHour()
         * -> getMinute()
         * -> getSeconds()
         * -> getNano() - a billionth of a second
         */
        int getMinutes = time_now.getMinute();

        /**
         * OFLOCALIZED METHODS
         ******************************
         * ofLocalizedDateTime WHEN PARSING FULL -> parse two formats i.e for date & Time
         * ofLocalizedTime() ->> can only take MEDIUM & SHORT
         * ofLocalizedDate() ->> FULL, LONG, MEDIUM, SHORT
         */

        DateTimeFormatter dtFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
        DateTimeFormatter dtFormat3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter dtFormat2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);


        /**
         * OFPATTERN METHOD
         * ***************************
         * ofPattern("mmmm dd yyyy hh:mm:ss") no of characters determines the verbosity eg
         * mm = 01
         * mmm = jan
         * mmmm = January
         *
         * EXCESS character eg 5Ms instead of 4 will give an IllegalArgumentException
         *
         * Notice UPPERCASE for (M) in month and LOWERCASE (m) for minute
         */
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("MMMM, DD, yy hh:mm:ss");


        /**
         * PERIODS
         * *******************
         * Period.ofYears(int noOfyears)
         * period.ofMonths(int noOfmonths)
         * period.ofWeeks(int noOfWeeks)
         * period.of(int noOf years, months, days) eg (1,0,7) //very year and 7 days
         * Chaining will give wrong results eg
         * Period wrong = Period.ofYears(1).ofWeeks(1); // every week
         */


        //lets add a period of one year from current Date
        Period annual = Period.ofYears(1);
        LocalDate newDate = LocalDate.now().plus(annual);


        System.out.println("LocalDate: "+date_today);
        System.out.println("LocalTime: "+time_now);
        System.out.println("LocalDateTime: "+time_date);
        System.out.println("getYear(): "+getYear);
        System.out.println("DateTimeFormatter Full Date: " +dtFormat.format(time_date));
        System.out.println("DateTimeFormatter Date Only: " +dtFormat2.format(time_date));
        System.out.println("DateTimeFormatter FULL DATE MEDIUM: " +dtFormat3.format(time_date));
        System.out.println("DateTimeFormatter ofPatten Method: " +ofPattern.format(time_date));
        System.out.println("Add a period of 1 year from current date: " + newDate);

    }
}
