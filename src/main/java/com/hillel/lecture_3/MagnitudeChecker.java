package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        if (Math.abs(a) > Math.abs(b)) {
            System.out.println("The number " + a + " has the greatest magnitude!");
            result = "The number " + a + " has the greatest magnitude!";
        } else if (Math.abs(a) == Math.abs(b)) {
            System.out.println("The numbers " + a + " and " + b + " are equals by magnitude!");
            result = "The number " + a + " and " + b + " are equals by magnitude!";
        } else {
            System.out.println("The number " + b + " has the greatest magnitude!");
            result = "The number " + b + " has the greatest magnitude!";
        }
        return result;
    }
}
