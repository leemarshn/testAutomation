package com.company.exceptions;

/**
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * ArithmeticException
 * IllegalArgumentException thrown by the programmer
 * NumberFormatException thrown by the programmer
 * <p>
 * ******************************************
 * a try statement must have catch and/or finally .
 * <p>
 * ------------------------------------
 * ---------------------------------
 * Checked exceptions - cna be thrown by programmer or jvm
 * IOException
 * FileNotFoundException
 * <p>
 * ==================================
 * errors are thrown by jvm and should not be handled
 * ExceptionInInitializerError
 * NoClassDefFoundError
 * StackOverflowError
 */

public class DivByZero {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int c = num1 / num2;
            System.out.println(c);
        } catch (NullPointerException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Division BY Zero Error");
        }

        System.out.println("We got here too");
    }
}


//dont add new checked exceptions while overriding
class CanNotHopException extends Exception {
    long y = 123_123l;

}

class Hopper {
    public void hop() {
    }
}

//class Bunny extends Hopper {
////    public void hop() throws CanNotHopException {
//    } // DOES NOT COMPILE
//}
