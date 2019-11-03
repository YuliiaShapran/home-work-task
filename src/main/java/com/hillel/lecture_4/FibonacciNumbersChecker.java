package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = new int[number];

        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i < number ; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        for (int i = 0; i < number ; i++) {
            System.out.print(result[i] + "\t");
        }

       return result;
    }
}

