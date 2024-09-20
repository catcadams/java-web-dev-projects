package org.launchcode;

import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        double radius = -1.0;
        while (radius < 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
        }

        System.out.println("The area is: " + Circle.getArea(radius));

    }
}
