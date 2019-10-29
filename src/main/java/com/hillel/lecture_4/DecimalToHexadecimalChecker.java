package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        int rem;
        String result = "";
       char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(value > 0){
            rem = value%16;
            result = hexchars[rem] + result;
            value = value/16;
        }

        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        String digits = "0123456789ABCDEF";
        value = value.toUpperCase();

        int result = 0;

        for(int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            int d = digits.indexOf(c);
            result = 16 * result + d;
        }

        return result;
    }
}
