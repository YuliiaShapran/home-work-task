package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        String toUppercase = word.toUpperCase();
        result = toUppercase;
        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        String toLowerCase = word.toLowerCase();
        result = toLowerCase;
        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        String[] arrSplit = sentence.split(".");
        for (int i = 0; i < arrSplit.length; i++) {
            System.out.println(arrSplit[i]);
        }
        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        char[] array = sentence.toCharArray();
        array[0] = Character.toUpperCase(array[0]); // Uppercase first letter

        // Uppercase all letters that follow a whitespace character
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == ' '){
            //if (Character.isWhitespace(array[i - 1])) {
                array[i] = Character.toUpperCase(array[i]);

                String str2 = new String(array);
                System.out.println(str2);
//                result = result+array;
//                System.out.println(array);
            }
        }

        return result;
    }
}
