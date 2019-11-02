package com.hillel.lecture_4;

/**
 * Написать программу, которая считает сумму двух колонок. Если
 * одна из колонок больше, вывести, какая именно больше. Если
 * колонки одинаковы - вывести результат в виде:
 * | row_1 | row_2 | sum |
 * | 2 | 5 | 7 |
 */
public class RowSumTestTask {
    public static void main(String[] args) {
        int[] row_1 = {10, 2, 4, 5, 18, 4};
        int[] row_2 = {0, 5, 1, 3, 7, 12};
        int commonSum = 0;
        int sum_1 = 0;
        int sum_2 = 0;

        if (row_1.length > row_2.length) {
            System.out.println("row_1 > row_2");
        } else if (row_2.length > row_1.length) {
            System.out.println("row_2 > row_1");
        } else {
            for (int i = 0; i < row_1.length; i++) {
                sum_1 = sum_1 + row_1[i];
            }
            for (int j = 0; j < row_1.length; j++) {
                sum_2 = sum_2 + row_2[j];
            }
            commonSum = sum_1 + sum_2;

            System.out.println("| row_1 | row_2 | sum |");
            System.out.println("| " + sum_1 + " | " + sum_2 + " | " + commonSum);
        }
    }
}
