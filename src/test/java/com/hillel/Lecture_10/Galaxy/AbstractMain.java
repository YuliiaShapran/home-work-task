package com.hillel.Lecture_10.Galaxy;

public class AbstractMain {
    public static void main(String[] args) {

        Stars stars = new Stars();
        System.out.println("Stars's class information: ");
        System.out.println(stars.siriusColor);
        System.out.println(stars.canopus);
        System.out.println("\n");

        Planets planets = new Planets();
        System.out.println("Planets's class information: ");
        planets.computePlanetWeight();
    }
}
