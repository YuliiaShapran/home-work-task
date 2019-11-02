package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = false;

        int n = value.length();

        for (int i = 0; i < (n/2) ; ++i) {
            if (value.charAt(i) != value.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }

}
