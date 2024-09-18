package org.launchcode;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle: ");
        Integer rectangleLength = input.nextInt();

        System.out.println("What is the width of the rectangle: ");
        Integer rectangleWidth = input.nextInt();
        input.close();

        System.out.println("Area: " + (rectangleWidth*rectangleLength));
    }
}
