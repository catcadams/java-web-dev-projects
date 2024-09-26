package org.launchcode;

import java.util.ArrayList;

public class WordListMethod {
    public static ArrayList<String> wordList(ArrayList<String> list, int input) {
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        for (String word: list) {
            if(word.length() == input) {
                fiveLetterWords.add(word);
            }
        }
        return fiveLetterWords;
    }
}
