package com.company.flowCcontrol;

public class NestedIfs {
    public static void main(String[] args) {
        if (true)
            if (!false)
                if (false)
                    System.out.println("wwe got here");
                else System.out.println("inner else");
                else System.out.println("second else");

    }
}
