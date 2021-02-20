package com.company.flowCcontrol;

public class IfElse {
    public static void main(String[] args) {
        int score = 67;

        if (score>=75)
        System.out.println("A");
        else if (score>=65)
//            System.out.println("L");
            System.out.println("B");
        else if (score>=55)
            System.out.println("C");
        else if(score>=40)
            System.out.println("D");
        else
            System.out.println(score);

    }
}
