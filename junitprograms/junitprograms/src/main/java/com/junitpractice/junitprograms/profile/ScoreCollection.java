package com.junitpractice.junitprograms.profile;

import com.junitpractice.junitprograms.basics.Scoreable;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<com.junitpractice.junitprograms.basics.Scoreable> scoreableList = new ArrayList<>();

    public void add(com.junitpractice.junitprograms.basics.Scoreable scrollable) {
        scoreableList.add(scrollable);
    }

    public int arithMeticMean() {
        int total = scoreableList.stream().mapToInt(Scoreable::getScore).sum();
        return total / scoreableList.size();
    }
}
