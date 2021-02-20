package com.company.classDesign;

import java.util.ArrayList;

public class ArraySearchCustom {
    public static void main(String[] args) {
        String [] array = {"Cow", "Goat", "Chicken", "Cow", "Pigs", "Turkey", "Cow", "Lamb"};

        ArraySearchCustom sm = new ArraySearchCustom();
        try {
            for (Integer i : sm.searchString(array, "Cat")) System.out.println(i);
        }catch (NullPointerException e){
            System.out.println("Not found");
        }
    }

     ArrayList<Integer> searchString(String[] array, String searchResults) throws NullPointerException{
        ArrayList<Integer> index = new ArrayList<Integer>();
        for (int i=0; i<array.length; i++){
            if (array[i].equals(searchResults)){
                index.add(i);
            };
        }

        if (index.size()==0)
            index = null;

        return index;
    }
}
