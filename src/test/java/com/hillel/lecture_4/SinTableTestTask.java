package com.hillel.lecture_4;


/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {

        System.out.println("Degrees" + "\t Radians");

        for (double i = 0; i <= 360; i = i + 10) {
            System.out.print(i + "\t");
            double inDegrees = i;
            double inRadians = Math.toRadians(inDegrees);
            double sin = Math.sin(inRadians);
            System.out.println("" + sin);

        }
    }
}
