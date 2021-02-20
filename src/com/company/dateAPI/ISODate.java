package com.company.dateAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ISODate {
    public static void main(String[] args) {

        String printDate = LocalDate.parse("2057-08-11")
                .format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(printDate);
    }
}
