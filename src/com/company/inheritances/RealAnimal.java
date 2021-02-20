package com.company.inheritances;

public class RealAnimal {
    private int age;
    private String name;

    public RealAnimal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public RealAnimal(int age) {
        super();
        this.age = age;
        this.name = null;
    }

//    public RealAnimal(){}
}
