package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(154,4));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!

        System.out.println(CheckFileExtension("MyCode"));
    }

    public static int Divide(int x, int y)
    {
        // Write code here!
        if (y==0) {
            try {
                throw new ArithmeticException("You're trying to divide by 0; please try a different number");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return (x/y);
    }

    public static int CheckFileExtension(String fileName)
    {
        int studentPoints = 0;

        // Write code here!
        if (fileName.endsWith(".java")) {
            studentPoints = 1;
        } else if (fileName == null || fileName.isEmpty()) {
            try {
                studentPoints = -1;
                throw new NoFileException("Student has not submitted a file");
            } catch (NoFileException e) {
                e.printStackTrace();
            }
        } else {
            studentPoints = 0;
        }
        return studentPoints;
    }
}