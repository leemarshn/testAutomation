package com.company.inheritances;

public class Animalia implements Structure {

    public void sound(){
        System.out.println("Animal sounding");
    }

    void eat(){
        System.out.println("animal Eating");
    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }
}
