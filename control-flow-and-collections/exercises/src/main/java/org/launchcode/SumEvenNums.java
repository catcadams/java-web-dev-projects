package org.launchcode;

import java.util.ArrayList;

public class SumEvenNums {
    public static Integer addEvenNums(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer: arr)
            if (integer % 2 == 0) {
            sum += integer;
        }
        return sum;
    }
}
