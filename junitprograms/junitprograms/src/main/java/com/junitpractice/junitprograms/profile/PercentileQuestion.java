package com.junitpractice.junitprograms.profile;

public class PercentileQuestion extends Question {

    public PercentileQuestion(String text, String[] answerChoices, int id) {
        super(text, answerChoices, id);
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected <= actual;
    }
}
