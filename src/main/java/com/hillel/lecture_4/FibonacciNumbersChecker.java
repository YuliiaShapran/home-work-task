package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result = {};
        int previousNumber = 0;
        int nextNumber = 1;

        for (int i = 1; i <= number ; ++i) {

            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
       return result;
    }
}

