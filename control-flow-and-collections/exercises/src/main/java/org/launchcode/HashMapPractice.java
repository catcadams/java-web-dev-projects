package org.launchcode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty()) {
                System.out.println("ID Number: ");
                Integer idNumber = input.nextInt();
                students.put(idNumber, newStudent);

                input.nextLine();
            }
        }
        while(!newStudent.isEmpty());
        input.close();

        System.out.println("\n Class roster by ID number: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + students.size());
    }
}
