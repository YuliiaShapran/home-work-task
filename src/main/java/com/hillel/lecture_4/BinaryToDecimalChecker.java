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
        int temp = 0;
        int i = 1;

        while (value > 0){
            temp = value % 2;
            result = result + temp * i;
            value = value / 2;
            i = i * 10;
        }
        return result;

    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        int p = 0;

        while(value != 0)
        {
            result+= ((value%10) * Math.pow(2,p));
            value = value/10;
            p++;
        }
        return result;
    }
}
