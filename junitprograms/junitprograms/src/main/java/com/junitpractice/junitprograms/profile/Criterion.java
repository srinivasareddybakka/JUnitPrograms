package com.junitpractice.junitprograms.profile;

public class Criterion implements Scoreable {
    private Weight weight;
    private Answer answer;
    private int score;

    public Criterion(Answer answer, Weight weight) {
        this.answer = answer;
        this.weight = weight;
    }

    @Override
    public int getScore() {
        return score;
    }

    public Weight getWeight() {
        return weight;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
