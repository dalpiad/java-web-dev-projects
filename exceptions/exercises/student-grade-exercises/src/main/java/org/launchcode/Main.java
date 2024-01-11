package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(3,2);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (Map.Entry<String, String> studentGrades : studentFiles.entrySet()) {
            System.out.println(studentGrades.getKey() + "'s grade is: " + CheckFileExtension(studentGrades.getValue()));
        }
    }

    public static void Divide(int x, int y)
    {
        // Write code here!

        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero!");
            } catch (ArithmeticException e) {
                e.printStackTrace();;
            }
        }

        double quotient = (x/y);
        System.out.println(quotient);
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.isBlank()) {
            try {
                throw new NullPointerException("You must provide a valid filename!");
            } catch (NullPointerException a) {
                System.out.println("You must provide a valid filename!");
                return -1;
            }
        } else if (fileName.endsWith(".java")) {
        return 1;
        } else {
            return 0;
        }
    }
}