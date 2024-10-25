package org.example;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<Integer> correctAnswers;
    private ArrayList<Integer> userAnswers;

    public Checkbox(String question, ArrayList<String> answerOptions, int pointCount) {
        super(question, answerOptions, pointCount);
    }

    @Override
    public boolean checkAnswers() {
        return false;
    }

    @Override
    public int addPoints() {
        return 0;
    }
}
