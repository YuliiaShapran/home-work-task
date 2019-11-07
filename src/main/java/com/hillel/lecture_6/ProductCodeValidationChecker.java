package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;
        int firstNumber, secondNumber, thirdNumber, multiplicationResult, inputMultiplicationResult;

        String[] array = code.split(" ");
        String checkOfAllUpperCase = array[0].toUpperCase();
        if (!array[0].equals(checkOfAllUpperCase)) { // если все символы кроме первого не равны UpperCase
            return isValid;
        }

        String checkOfOnlyNumbers = array[0].replaceAll("\\D+", ""); //can use regex and delete non-digits
        firstNumber = Integer.valueOf("" + checkOfOnlyNumbers.charAt(0) + checkOfOnlyNumbers.charAt(1)); // без "" будет просто сумма двух чисел
        secondNumber = Integer.valueOf("" + checkOfOnlyNumbers.charAt(2) + checkOfOnlyNumbers.charAt(3));
        thirdNumber = Integer.valueOf("" + checkOfOnlyNumbers.charAt(4) + checkOfOnlyNumbers.charAt(5));
        multiplicationResult = firstNumber * secondNumber * thirdNumber;
        System.out.println(multiplicationResult);

        inputMultiplicationResult = Integer.valueOf(array[1]);

        if (multiplicationResult == inputMultiplicationResult ){
            isValid = true;
        }

        return isValid;
    }
}
