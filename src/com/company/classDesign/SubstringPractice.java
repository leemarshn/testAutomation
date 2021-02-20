package com.company.classDesign;

public class SubstringPractice {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("LeeN:");
        sb =sb .append(" I love coding it make me happy");
        sb.insert(sb.length(), " Ginger");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
