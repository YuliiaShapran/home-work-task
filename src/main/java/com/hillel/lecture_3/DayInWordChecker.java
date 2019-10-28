package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class DayInWordChecker {

    public String getDayIfElse(int number) {
        //        TODO implements result
        String result = "";
        if(number == 1) {
            System.out.println("Monday");
            result = "Monday";
        } else if(number == 2) {
            System.out.println("Tuesday");
            result = "Tuesday";
        } else if(number == 3) {
            System.out.println("Wednesday");
            result = "Wednesday";
        } else if(number == 4) {
            System.out.println("Thursday");
            result = "Thursday";
        } else if(number == 5) {
            System.out.println("Friday");
            result = "Friday";
        } else if(number == 6) {
            System.out.println("Saturday");
            result = "Saturday";
        } else if(number == 7) {
            System.out.println("Sunday");
            result = "Sunday";
        } else if(number == 8) {
            System.out.println("Not a valid day");
            result = "Not a valid day";
        }
        return result;
    }

    public String getDaySwitchCase(int number) {
        //        TODO implements result
        String result = "";
        switch (number) {
            case 1:
                System.out.println("Monday");
                result = "Monday";
                break;
            case 2:
                System.out.println("Tuesday");
                result = "Tuesday";
                break;
            case 3:
                System.out.println("Wednesday");
                result = "Wednesday";
                break;
            case 4:
                System.out.println("Thursday");
                result = "Thursday";
                break;
            case 5:
                System.out.println("Friday");
                result = "Friday";
                break;
            case 6:
                System.out.println("Saturday");
                result = "Saturday";
                break;
            case 7:
                System.out.println("Sunday");
                result = "Sunday";
                break;
            case 8:
                System.out.println("Not a valid day");
                result = "Not a valid day";
                break;
        }
        return result;
    }
}
