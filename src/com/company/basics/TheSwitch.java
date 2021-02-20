package com.company.basics;

/**
 * The variable of the case must be final and must be initialized
 * *************************************
 * int and Integer
 * byte and Byte
 * short and Short
 * char and Character
 * String
 * enum value
 */

public class TheSwitch {
    public static void main(String[] args) {


        for (int i = -11; i <= 25; i++) {
           final int hour = timeIntervals(i);
           final int num = 3;
//           final String name = "Lee";
            switch (hour) {
                default:
                    System.out.println("Greetings don't exists " + i);
//                    hour = 78;
//                    System.out.println(hour);
                    break;
                case 1:
                    System.out.println("Good Morning " + i);
//                    hour = 56;
//                    System.out.println(hour);
                    break;
                case 2:
                    System.out.println("Good Afternoon " + i);
                    break;
                case num:
                    System.out.println("Good Evening " + i);
                    break;
                case 4:
                    System.out.println("Wee Hours " + i);
                    break;
                case -1:
                    System.out.println("We did not Understand your input " + i);
            }

        }
    }

    public static int timeIntervals(int range) {
        if (range >= 0 & range < 12) {
            range = 1;
        } else if (range >= 12 & range < 16) {
            range = 2;
        } else if (range >= 16 & range <= 23) {
            range = 3;
        } else {
            range = -1;
        }
        return range;
    }
}
