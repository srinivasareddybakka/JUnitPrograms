package com.junitpractice.junitprograms.profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Criteria implements Iterable<Criterion> {

    private List<Criterion> criterionList = new ArrayList<>();

    public void add(Criterion criterion) {
        criterionList.add(criterion);
    }


    @Override
    public Iterator<Criterion> iterator() {
        return criterionList.iterator();
    }

    public int arithmeticMean() {
        return 0;
    }

    public double geometricMean(int[] numbers) {
        int totalNumbers = Arrays.stream(numbers)
                .reduce(1, (product, number) -> product * number);
        return Math.pow(totalNumbers, 1.0 / numbers.length);

    }
}
