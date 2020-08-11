package com.junitpractice.junitprograms.profile;

public abstract class Question {
    private String text;
    private String[] answerChoices;
    private int id;

    public Question(String text, String[] answerChoices, int id) {
        this.text = text;
        this.answerChoices = answerChoices;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public String getAnswerChoices(int i) {
        return answerChoices[i];
    }

    public boolean match(Answer answer) {
        return false;
    }

    abstract public boolean match(int expected, int actual);

    public int indexOf(String matchingAnswerChoices) {
        for (int i = 0; i < answerChoices.length; i++)
            if (answerChoices[i].equals(matchingAnswerChoices))
                return i;
        return -1;

    }

}
