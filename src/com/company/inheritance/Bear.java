package com.company.inheritance;

import com.company.inheritances.Structure;

interface Herbivore {
public void eatPlants();
default String name(){
    return "Herbivore";
}

    static int getHeight(int y) {
        return 0;
    }
}

interface Omnivore {
public void eatPlants();
public void eatMeat();
//default public  String name(){
//    return "Omnivore";
//}
}



public class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {
        System.out.println("I love eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("I don't eat meat");
    }
Integer k = new Integer(8);

//    public String name(){
//        return "LeeN-Loves-Cats";
//    }

    public static void main(String[] args) {
        Herbivore cat = new Bear();
        System.out.println(cat.name());
    }
}