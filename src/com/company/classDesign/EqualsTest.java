package com.company.classDesign;

public class EqualsTest {

    public static void main(String[] args) {
        String x = "I love LeeN";
        String y = "I Love LeeN ".trim();

        StringBuilder text = new StringBuilder(x);
        text.append(y);
        System.out.println(text);

        System.out.println(x.equalsIgnoreCase(y));

        System.out.println(x==y);
    }
}
