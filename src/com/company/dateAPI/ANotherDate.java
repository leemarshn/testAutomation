package com.company.dateAPI;

import java.time.LocalDate;

public class ANotherDate {

    public static void main(String[] args) {

//        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
//        LocalDate paulBday = LocalDate.parse("2002-07-29");
//        System.out.println(shreyaBday.isAfter(paulBday));
//        System.out.println(shreyaBday.isBefore(paulBday));
//        System.out.println(shreyaBday.isBefore(shreyaBday));

        LocalDate bday = LocalDate.of(2052, 03, 10);
        System.out.println(bday.minusDays(10));
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));


    }
}
