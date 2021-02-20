package com.company.coingame;

public class IsPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 888;

        if(num < 2) isPrime = false;
        else isPrime = true;

        for(int i=2; i <= num/i; i++) {
            if ((num % i) == 0) {
                System.out.println(i);
                isPrime = false;
            }


            if (isPrime) System.out.println("Prime");
            else System.out.println("Not Prime");
        }
    }

}
