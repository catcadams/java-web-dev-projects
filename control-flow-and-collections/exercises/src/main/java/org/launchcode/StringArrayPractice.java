package org.launchcode;

import java.util.Arrays;

public class StringArrayPractice {
    public static void main(String[] args) {
        String stringPhrase = ("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String[] array = stringPhrase.split("\\.");
        System.out.println(Arrays.toString(array));
    }
}
