package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven: ");
        float miles = input.nextFloat();

        System.out.println("How many gallons of gas have you used: ");
        float gallonsOfGas = input.nextFloat();
        input.close();

        float milesPerGallon = miles/gallonsOfGas;
        System.out.println("MPG: " + milesPerGallon);
    }
}
