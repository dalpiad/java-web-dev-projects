package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayListPractice {
    static Scanner input = new Scanner(System.in);
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static String fiveLetters(ArrayList<String> arr) {
        String words = "";

        for (String word : arr) {
            if (word.length() == 5) {
                words += word + " ";
            }
        }
        return words;
    }

    public static String pickLetters(ArrayList<String> arr) {
        String words = "";
        System.out.println("Enter the length for the word to find: ");
        int wordLength = input.nextInt();
        for (String word : arr) {
            if (word.length() == wordLength) {
                words += word + " ";
            }
        }
        return words;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(0);
        numbers.add(5);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(6);

        System.out.println(sumEven(numbers));

        ArrayList<String> words = new ArrayList<>(10);
        words.add("Chicken");
        words.add("poodle");
        words.add("meant");
        words.add("Christmas");
        words.add("Stockings");
        words.add("Alphabet");
        words.add("trigger");
        words.add("mom");
        words.add("doom");
        words.add("sells");
        words.add("splotch");
        words.add("resent");
        words.add("endure");
        words.add("rocks");
        words.add("sadness");
        words.add("people");
        words.add("infinite");
        words.add("dream");

        System.out.println(fiveLetters(words));

        System.out.println(pickLetters(words));

        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";

        String[] strSplit = phrase.split(" ");

        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strSplit));

        System.out.println(pickLetters(strList));
    }
}
