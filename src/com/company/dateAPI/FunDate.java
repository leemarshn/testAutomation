package com.company.dateAPI;

import java.time.LocalDateTime;

public class FunDate {
    public static void main(String[] args) throws InterruptedException {

        for (int k =0; k<1000; k++) {
            LocalDateTime now = LocalDateTime.now();
            System.out.print(now.getNano() + "" + now.getNano() + "" + now.getNano());
            System.out.print(now.getNano() + "" + now.getNano() + "" + now.getNano());
            System.out.print(now.getNano() + "" + now.getNano() + "" + now.getNano());
            System.out.print(now.getNano() + "" + now.getNano() + "" + now.getNano());
            System.out.print(now.getNano() + "" + now.getNano() + "" + now.getNano());

            System.out.println(now.getNano() + "" + now.getNano() + "" + now.getNano() +"" + now.getSecond());
            Thread.sleep(10);
        }
        System.out.println("**************************************** JUST FOR FUN ***************************");
    }
}
