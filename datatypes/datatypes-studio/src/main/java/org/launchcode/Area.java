package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String userInput = input.nextLine();
        while (!(userInput.contains("0")) && !(userInput.contains("1")) && !(userInput.contains("2")) && !(userInput.contains("3")) && !(userInput.contains("4")) && !(userInput.contains("5")) && !(userInput.contains("6")) && !(userInput.contains("7")) && !(userInput.contains("8")) && !(userInput.contains("9"))) {
            System.out.println("Invalid entry.");
            System.out.println("Enter a radius: ");
            userInput = input.nextLine();
        }
        double radius = Double.parseDouble(userInput);
        if (radius > 0) {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " +radius+" is: "+area);
        } else {
            System.out.println("You did not enter a positive number");
        }
    }
}
