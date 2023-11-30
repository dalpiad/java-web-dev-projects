package org.launchcode;

import java.util.Scanner;

public class AliceSearchExpanded {
    static String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister was " +
            "reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
            "thought Alice ‘without pictures or conversation?’";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which word would you like remove? ");
        String word = input.nextLine();

        System.out.println("'"+word+"' is found at index "+ wonderland.toLowerCase().indexOf(word.toLowerCase())+". The length of the word '"+word+"' is "+word.length());
        String lookingGlass = wonderland.replace(word, "");
        System.out.println(lookingGlass);
    }
}
