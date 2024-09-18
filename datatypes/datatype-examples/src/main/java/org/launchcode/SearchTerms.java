package org.launchcode;

import java.util.Scanner;

public class SearchTerms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, 'and what is the use " +
                "of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Insert a term to search through text: ");
        String userTerm = input.nextLine();

        if (aliceSentence.toLowerCase().contains(userTerm.toLowerCase())){
            System.out.println("true");

            Integer index = aliceSentence.toLowerCase().indexOf(userTerm.toLowerCase());
            Integer termLength = userTerm.length();
            System.out.println("Index: " + index + "  Length: " + termLength);

            String changedSentence = aliceSentence.replace(userTerm, "");
            System.out.println(changedSentence);

        } else {
            System.out.println("false");
        }
    }
}
