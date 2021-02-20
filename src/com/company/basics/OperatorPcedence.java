package com.company.basics;

public class OperatorPcedence {
    public static void main(String[] args) {
        var y =4;
        double x = 2 + 3 * --y;
        double k = (2+3) * --y;

//        System.out.println("k= " + k + "x= " + x + "y= "  +y);

        double v = 34.1;
//        float u = 33.2;

        float n = 2;
        int b = (int) (4 * --n *2 );

        float q = 23/7;
        System.out.println(b);

    }
}
