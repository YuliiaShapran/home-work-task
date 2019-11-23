package com.hillel.Lecture_10.Galaxy;

import java.util.Scanner;

public class Planets extends AbstractGalaxy {

    public void computePlanetWeight(){
        double weight = 34;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 6: ");
        int planet = scanner.nextInt();
        switch (planet){
            case 1:
                System.out.println("Venus weight is " + weight * 0.78);
                break;
            case 2:
                System.out.println("Mars weight is " + weight * 0.39);
                break;
            case 3:
                System.out.println("Jupiter weight is " + weight * 2.65);
                break;
            case 4:
                System.out.println("Saturn weight is " + weight * 1.17);
                break;
            case 5:
                System.out.println("Uranus weight is " + weight * 1.05);
                break;
            case 6:
                System.out.println("Neptune weight is " + weight * 1.23);
                break;
            default:
                System.out.println("Not correct choice! Number must be from 1 to 6");

        }
    }
}
