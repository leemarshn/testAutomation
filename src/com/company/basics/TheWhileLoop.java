package com.company.basics;

public class TheWhileLoop {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        do {

            System.out.println(y +" "+x);
            x--;
            y++;

        }while (y<x);
    }
}
