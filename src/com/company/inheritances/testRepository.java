package com.company.inheritances;

public interface testRepository {

    void sayMyName();

    default void isEatTime(){
        System.out.println("base interface");
    }

}
