package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the height of the rectangle?");
        int height = input.nextInt();

        System.out.println("What is the width of the rectangle?");
        int width = input.nextInt();
        System.out.println("The area of the rectangle is " + height*width);
    }
}
