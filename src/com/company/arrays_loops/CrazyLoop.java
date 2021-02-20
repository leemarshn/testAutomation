package com.company.arrays_loops;

public class CrazyLoop {

    void crazyLoop(){
        int c =0;
        Jack: while (c<8){
        JILL:
        System.out.println(c);
        if(c>3)
            System.out.println(c);
//            break JILL;
        else c++;
        }
    }
}
