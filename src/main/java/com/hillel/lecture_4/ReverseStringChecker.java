package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = ""; //  в result возвр результат

        char[] charArray = value.toCharArray();
        int j = value.length();

        for (int i = j; i > 0; i--) {

            result = result + charArray[i - 1];
        }

        System.out.print(result);

//        int lastSymbol = value.length() - 1;
//        for (int i = lastSymbol; i >= 0 ; i--) {
//            result = result + value.charAt(i);
//        }
        return result;
    }
}