package com.company.flowCcontrol;

public class SwitchSalaries {
    public static void main(String[] args) {
        String name = "";

        switch (name) {
            default:
                System.out.println("does Not Exist");
            case "Lee":
                System.out.println(50000);
                break;

            case "Nyambura":
                System.out.println(70000);

            case "Wambui":
                System.out.println(45000);

//            default:
//                System.out.println("does not exist");
        }

        String day = new String("SUN");
//                Boolean y = false;
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work");
                break;
            case "FRI":
                System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day?");
        }
//you can use variables expression in a case if they are marked final
       final int a = 10, b = 20, c = 30;
       final int y=10;
        switch (a) {
            case b + c:
                System.out.println(b + c);
                break;
            case 10 * 7:
                System.out.println(10 * 7512 + 10);
                break;
            case y:
                System.out.println(585);
                break;
        }

    }
}
