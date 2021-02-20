package com.company.inheritance;

public class Phone {
    String keyboard = "in-built";
    boolean playMovie = true;

    void sing(){
        System.out.println("Super singing");
    }
}

class Tablet extends Phone {
    boolean playMovie = false;

    void sing(){
        System.out.println("child Singing");
    }
}

class College2 {
    public static void main(String args[]) {

        Phone phone = new Tablet();
        System.out.println(phone.keyboard + ":" + phone.playMovie);

        ((Phone)phone).sing();
    }
}