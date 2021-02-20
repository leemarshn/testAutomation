package com.company.classDesign;

public class SplitStrings {

    public static void main(String[] args) {
        String text = "I love going to church";
        String textSequence = "LEEN";
        String[] newText = textSequence.split("\\S");
        String textReplace = text.replace("\\s", "A");
        System.out.println(newText.length);


    }
}
