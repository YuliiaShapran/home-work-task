package com.hillel.lecture_3;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    public String checkNumber(int number) {

//        TODO implements result
        String result = "";

        if (number >= 50) {
            System.out.println("PASS");
            result = "PASS";
        } else {
            System.out.println("FAIL");
            result = "FAIL";
        }

        return result;
    }
}
