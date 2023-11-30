package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = input.nextInt();

        System.out.println("How many gallons of fuel have you used?");
        int fuel = input.nextInt();
        System.out.println("Your miles per gallon is " + miles/fuel);
    }
}
