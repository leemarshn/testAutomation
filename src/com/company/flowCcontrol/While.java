package com.company.flowCcontrol;

public class While {
    public static void main(String[] args) {

        int num = 9;
        boolean divisibleBy7 = false;
        while (!divisibleBy7) {
            System.out.println(num);
            if (num % 7 == 0) divisibleBy7 = true;
//            --num;
            System.out.println(num);
//            System.out.print();

            --num;
        }
    }
}
