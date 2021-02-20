package com.company.basics;

import java.util.*;

public class RandomClass {

    {
        System.out.println("Setting Field");
    }

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(1000));
        RandomClass rc = new RandomClass();
    }

    {
        System.out.println("Instance Initializer");
    }
}
