package com.company.arrays_loops;

public class Arrays_ForLoop {
    public static void main(String[] args) {
        String[][] userDetails = {{"Lee", "Ndegwa"},{"Nairobi", "Mombasa", "Kenya", "United States"},
                                    {"Wanjiru", "Macharia", "Wairimu"},{"Harvard"},{"MIT"}};
//        for (String[][] details: userDetails)
//            for (String[] loops: details)
//                for (String loop: loops)
//            System.out.println(loop);

        for (int i=0; i<userDetails.length; i++){
            for (int j =0; j<userDetails[i].length; j++)
                System.out.println(userDetails[i][j]+i +" "+j);
            System.out.println(userDetails[i].length);
        }

    }
}
