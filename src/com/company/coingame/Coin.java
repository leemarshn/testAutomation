package com.company.coingame;

import java.util.Random;

public class Coin {

    private String side;
    public final boolean head = true;
    public final boolean tail = false;


    public String flipCoin() {
        int min = 10000;
        int max = 100000;
        Random r = new Random();
        int number = r.nextInt((max - min) + 1) + min;

        System.out.println(number);

        if ((number%2)==0) {
            side = "head";
        }else {
            side = "tail";
        }

        double num = 3;


        return side;
    }

}
