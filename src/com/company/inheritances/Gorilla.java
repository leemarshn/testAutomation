package com.company.inheritances;

public class Gorilla extends RealAnimal {
    public Gorilla(int age) {
        super(age);
    }

    public Gorilla(int age, String name) {
        super(age, name);
    }

    public Gorilla(){

        super(10);
    }
}
