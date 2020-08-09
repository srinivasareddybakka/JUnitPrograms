package com.junitpractice.junitprograms.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCollectionTest {


    @Test
    public void test() {
        System.out.println("Basic Test method");
    }

    @Test
    public void answersofArithmeticmeanofTwoNumbers() {

        // arrange
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.add(() -> 5);
        scoreCollection.add(() -> 7);

        // calling arithmeticmean
        int total = scoreCollection.arithMeticMean();
        assertEquals(total, 6);
    }

}