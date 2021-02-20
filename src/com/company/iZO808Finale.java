package com.company;

public class iZO808Finale {
    public static void main(String[] args) {
        String  str = "overloaded\tmethods\tmust\tdiffer\tin\tthe\ttype\tand/or\tnumber\tof\n" +
                "their\tparameters.\tWhile\toverloaded\tmethods\tmay\thave\tdifferent\treturn\ttypes,\tthe\n" +
                "return\ttype\talone\tis\tinsufficient\tto\tdistinguish\ttwo\tversions\tof\ta\tmethod";
        String message = str.replaceAll("[\t\n ]", " ");
        System.out.println(message);

    }
}
