package com.junitpractice.junitprograms.basics;

import java.util.ArrayList;
import java.util.List;

public class ScoreCollection {
    private List<Scoreable> scoreableList = new ArrayList<>();

    public void add(Scoreable scrollable) {
        scoreableList.add(scrollable);
    }

    public int arithMeticMean() {
        int total = scoreableList.stream().mapToInt(Scoreable::getScore).sum();
        return total / scoreableList.size();
    }
}
