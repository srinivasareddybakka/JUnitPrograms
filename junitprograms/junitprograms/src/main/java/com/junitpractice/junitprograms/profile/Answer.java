package com.junitpractice.junitprograms.profile;

public class Answer {
    private int i;
    private Question question;

    public Answer(int i, Question question) {
        this.i = i;
        this.question = question;
    }

    public Answer(Question characterstic, String matchingValue) {
        this.question = characterstic;
        this.i = characterstic.indexOf(matchingValue);
    }

    public String getquestionText() {
        return question.getText();
    }

    @Override
    public String toString() {
        return String.format("%s %s", question.getText(), question.getAnswerChoices(i));
    }

    public boolean match(int expected) {
        return question.match(expected, i);
    }

    public boolean match(Answer otherAnswer) {
        return question.match(i, otherAnswer.i);
    }

    public Question getCharacterstic() {
        return question;
    }
}
