package org.launchcode;

import java.util.ArrayList;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(11);
        nums.add(24);
        nums.add(8);
        nums.add(10);
        nums.add(13);
        nums.add(33);
        nums.add(55);
        nums.add(10);
        nums.add(2);
        nums.add(5);
        Integer evenNumberSum = SumEvenNums.addEvenNums(nums);
        System.out.println(evenNumberSum);
    }
}
