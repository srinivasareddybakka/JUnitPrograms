package com.junitpractice.junitprograms.profile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProfileTest {

    @Test
    public void test() {
        Profile profile = new Profile("Bull Hockey, Inc");
        Question question = new BooleanQuestion(1, "Got bonues?");
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(Bool.TRUE, question);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);
    }

    @Test
    public void test1() {
        Profile profile = new Profile("Bull Hockey, Inc");
        Question question = new BooleanQuestion(1, "Got bonues?");
        Answer profileAnswer = new Answer(Bool.FALSE, question);
        profile.add(profileAnswer);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(Bool.TRUE, question);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);
    }

    @Test
    public void test2() {
        Profile profile = new Profile("Bull Hockey, Incorp");
        Question question = new BooleanQuestion(1, "Got bonues?");
        Answer profileAnswer = new Answer(Bool.TRUE, question);
        profile.add(profileAnswer);
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(Bool.FALSE, question);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);
        boolean matches = profile.matches(criteria);
        assertFalse(matches);
    }
}
