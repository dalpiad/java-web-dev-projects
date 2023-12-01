package org.launchcode;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        name = name.toUpperCase();
        System.out.println("Hello " + name);
    }
}
