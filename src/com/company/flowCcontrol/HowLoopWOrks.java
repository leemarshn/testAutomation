package com.company.flowCcontrol;

public class HowLoopWOrks {
     static public void main(String ...args) {

//        System.out.println(args[1]+":"+ args[2]+":"+ args[3]);

        int i = 0;
        for (; i < 2; i = i + 5) {
            if (i < 5) continue;
            System.out.println(i);
        }
//        System.out.println(i);


        for (int q =0; q<5; q++)
            System.out.println(q);
    }
}
