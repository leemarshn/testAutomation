package com.company.inheritances;

public class ConcreteAbs {

    public static void main(String[] args) {
        Abs2 abs2 = new Abs2();
        Abst1 abs = abs2;

        abs.getName();
    }
}
