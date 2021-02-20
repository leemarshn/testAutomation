package com.company.flowCcontrol;

public class Ternanry {
    public static void main(String[] args) {
//        System.out.println(80==90?"Noo":"yee");
        String month = "April";
        double bill = month == "April" ? 1900 - 1200 : 2900;
//        System.out.println(bill);

        int bill1 = 2000;
        int qty = 10;
        int discount = (bill < 1000) ? (qty > 11) ? 10 : 9 : 5;
        System.out.println(discount);


    }
}
