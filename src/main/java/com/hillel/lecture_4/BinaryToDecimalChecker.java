package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        while(value >= 0){
            value/= 2;
            result = result % 2 + value;
        }
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        int p=0;

        while(value != 0)
        {
            result+=((value%10) * Math.pow(2,p));
            value = value/10;
            p++;
        }
        return result;
    }
}
