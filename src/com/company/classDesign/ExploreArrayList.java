package com.company.classDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExploreArrayList {

    /*
     * ARRAYLIST METHODS
     * boolean add(E element)
     * void add(int index, E element)
     * remove()
     * set()
     * isEmpty
     * size()
     * clear()
     * contains
     * equals
     *
     * **/
    public static void main(String[] args) {
        ArrayList           list1 = new ArrayList();
        ArrayList<String>   countries = new ArrayList<>();

        //add()
        countries.add("Kenya");
        countries.add("South Africa");
        countries.add("China");

//        System.out.println("Add without using Index " + countries);

        //add using index position
        countries.add(0, "USA");
//        System.out.println("Add after inserting USA on index 0 " + countries);

        //remove()
//        countries.remove(0);
//        countries.remove(); won't compile
//        countries.remove(100); thows java.lang.IndexOutOfBoundsException
//        System.out.println("Removing using index position " + countries);


//        countries.remove("Kenya");
//        countries.remove("something does not exist"); nothing happens
//        System.out.println("Removing the actual word " +countries);

        //set() E set(int index, E newElement)
//        countries.set(0, "Indonesia"); // throws IndexOutOfBoundsException if index does not exist
        //check size
//        System.out.println(countries.size());
//        System.out.println(countries);


        //equals()
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        Object obj2 = new Object();
        Object obj3 = new Object();
        one.add("add");
        two.add("add");
        two.add("two");
//        System.out.println(obj2.equals(obj3));
//        System.out.println(one.equals(two)); //returns true

        //contains() -> returns boolean
//        System.out.println(countries.contains("Kenya"));

//      clear all elements of the list
//        countries.clear();


        //check is isEmpty()
        System.out.println(countries.isEmpty());


// convert  to an Array
//        countries.toArray();


      //  sorting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
//        Arrays.sort(array);
        System.out.println(numbers);




    }
}
