package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
        int countWord = 0;
        for (int i = 0; i < sentence.length() ; i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i+1) != ' '){
                countWord++;
                System.out.println(countWord+1);

                result = countWord+1;
            }

        }

        return result;
    }


}
