package org.example;

import java.util.ArrayList;

public abstract class Question {

    private String question;
    private ArrayList<String> answerOptions;
    private int pointCount;

    public Question(String question, ArrayList<String> answerOptions, int pointCount) {
        this.question = question;
        this.answerOptions = answerOptions;
        this.pointCount = pointCount;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(ArrayList<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public int getPointCount() {
        return pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    public abstract boolean checkAnswers();

    public abstract int addPoints();
}
