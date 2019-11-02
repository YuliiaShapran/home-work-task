package com.hillel.lecture_4;

/**
 * Написать программу, которая выводит все символы (char) в промежутке от 135 до 255
 */
public class PrintCharTestTask {
    public static void main(String[] args) {
        char[] array = new char[120];

        for (int i = 135; i <= 255 ; i++) {
            char resultInAscii = (char)i;
            System.out.println(resultInAscii);
            
        }
    }


}
