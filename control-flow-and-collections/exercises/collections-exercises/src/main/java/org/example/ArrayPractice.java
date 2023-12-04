package org.example;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i]);
        }
        for (int j : integerArray) {
            if ((j % 2) == 1) {
                System.out.println(j);
            }
        }
        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
