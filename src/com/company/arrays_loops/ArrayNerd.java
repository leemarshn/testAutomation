package com.company.arrays_loops;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNerd {
    public static void main(String[] args) {
        Integer[] arr = {5,2,3,4,5,99,7,8,0};
        for (int num: arr){
            System.out.println(num);
        }



        ArrayList arrList = new ArrayList();
        boolean b = arrList.add("Lee");

        System.out.println(b);

    }
}
