package com.company.basics;

/**
 * only one side of the ternary operator
 * will be evaluated at runtime
 *
 */

public class TenerayOperator {

    public static void main(String[] args) {
        int y = 5;
        int x = y > 3 ? 6 : Integer.parseInt("boy");

        System.out.println(x);
    }
}
