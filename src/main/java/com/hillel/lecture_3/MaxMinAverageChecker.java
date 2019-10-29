package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if(a > b && a > c) {
            result = a;
        } else if (b > a && b > c) {
            result = b;
        } else if(c > a && c > b) {
            result = c;
        } else {
            result = 0;
        }
        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if((a < b && a > c) || (a > b && a < c)) {
            result = a;
        } else if((b < a && b > c) || (b > a && b < c)){
            result = b;
        } else if((c < a && c > b) || (c > a && c < b)) {
            result = c;
        } else {
            result = 0 ;
        }
        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = 0;
        if(a < b && a < c) {
            result = a;
        } else if (b < a && b < c) {
            result = b;
        } else if(c < a && c < b) {
            result = c;
        } else {
            result = 0;
        }
        return result;
    }
}
