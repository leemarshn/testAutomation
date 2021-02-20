package com.company.exceptions;

public class Zoo {

    private String name ="Lee";

    public static void main(String[] args) {


        int y = 1;
        int z = 1;
        final int x = y <= 10 ? y++ : z++;
        System.out.println(y + "," + z); // Outputs 1,2



    }

    void getName(){
        System.out.println(this.name);
    }
}

