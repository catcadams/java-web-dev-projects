package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {

        String phrase = ("I would not, could not, in a box . I would not, could not with a fox . I will not eat them in a house . I will not eat them with a mouse .");

        ArrayList<String> listOfWords = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println(listOfWords);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length to search for: ");
        int userInput = input.nextInt();
        input.close();

        ArrayList<String> chosenWords = WordListMethod.wordList(listOfWords, userInput);
        System.out.println(chosenWords);
    }
}
