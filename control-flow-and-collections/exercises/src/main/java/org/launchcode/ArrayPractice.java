package org.launchcode;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numArray = {1, 1, 2, 3, 5, 8};
        for (int index: numArray) {
            if(index % 2 == 1) {
                System.out.println(index);
            }
        }
    }
}


