package com.company.exceptions;

import java.io.FileNotFoundException;

public class DemoThrowsException {
    public void readFile(String file) throws FileNotFoundException {

        boolean found = findFile(file);
        if (!found){
            System.out.println("cow");
            throw new FileNotFoundException("Missing file");}
        else {
//code to read file
        }

    }

    boolean findFile(String file) {
//code to return true if file can be located
        return false;
    }
}
