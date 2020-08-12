package com.junitpractice.junitprograms.profile;

import java.util.HashMap;
import java.util.Map;

public class Profile {
    private Map<String, Answer> answers = new HashMap<>();
    private String name;
    private int score;

    public Profile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(Answer answer) {
        answers.put(answer.getquestionText(), answer);
    }

    public boolean matches(Criteria criteria) {
        score = 0;
        boolean kill = false;
        boolean anyMatches = false;

        for (Criterion criterion : criteria) {
            Answer answer = answers.get(criterion.getAnswer().getquestionText());

            boolean match = criterion.getWeight() == Weight.DontCare || answer.match(criterion.getAnswer());

            if (!match && criterion.getWeight() == Weight.MustMatch) {
                kill = true;
            }
            if (match) {
                score += criterion.getWeight().getValue();
            }
            anyMatches |= match;
        }
        if (kill)
            return false;

        return anyMatches;
    }

    public int score() {
        return score;
    }

}
