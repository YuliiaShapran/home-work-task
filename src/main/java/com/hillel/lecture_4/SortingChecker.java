package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        int temp;
        for (int i = 1; i < values.length; i++) {
            for (int j = i; j > 0; j--) {
                if (values[j] < values[j - 1]) {
                    temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            result  = values;
        }
        return result;
    }



    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];
        int temp;
        for (int i = 1; i < values.length; i++) {
            for (int j = i; j > 0; j--) {
                if (values[j] > values[j - 1]) {
                    temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            result  = values;
        }
        return result;
    }
}
