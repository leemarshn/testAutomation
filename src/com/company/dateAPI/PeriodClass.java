package com.company.dateAPI;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodClass {
    public static void main(String[] args) {
        LocalDateTime tday = LocalDateTime.parse("2020-11-17T23:56:44.024728");
        Period ps = Period.parse("P2Y22M100D");
        System.out.println(tday.plusMonths(ps.getMonths()));
        System.out.println(ps);

    }
}
