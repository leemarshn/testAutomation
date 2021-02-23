package com.company.inheritances;

public interface testRepo2 extends testRepository{

     default void isEatTime(){
        System.out.println(" the extending interface");
    }
}
