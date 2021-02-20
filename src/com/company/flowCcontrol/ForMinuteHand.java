package com.company.flowCcontrol;

public class ForMinuteHand {
    public static void main(String[] args) {
      outer:  for (int hours =1; hours<24;hours++){
            for (int mins = 1; mins<60; mins++) {
                for (int sec = 1; sec < 60; sec++) {
                        System.out.println(hours + ":" + mins + ":" + sec);
                }
            }
        }


    }
}
