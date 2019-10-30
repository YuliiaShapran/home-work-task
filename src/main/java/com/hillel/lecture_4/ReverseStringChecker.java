package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        char[] reverse = value.toCharArray();
        for (int i = reverse.length-1; i>=0; i--)
            System.out.print("" + reverse[i]);
        return result;
    }

}
