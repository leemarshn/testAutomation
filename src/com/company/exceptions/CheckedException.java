package com.company.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
    public static void main(String args[]) {
        FileInputStream fis = null;
        /*This constructor FileInputStream(File filename)
         * throws FileNotFoundException which is a checked
         * exception
         */
//        try {
//            fis = new FileInputStream("B:/myfile.txt");
//        } catch (FileNotFoundException | IOException e) {
//            e.printStackTrace();
//        }
//        int k;

        /* Method read() of FileInputStream class also throws
         * a checked exception: IOException
         */
//        while ((k = fis.read()) != -1) {
//            System.out.print((char) k);
//        }

        /*The method close() closes the file input stream
         * It throws IOException*/
//        fis.close();
    }

}

/**
 * javac ClassName
 * java class
 */
