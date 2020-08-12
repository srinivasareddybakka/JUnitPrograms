package com.junitpractice.junitprograms.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private List<Question> characterstics = new ArrayList<>();

    public void add(Question characterstic) {
        characterstics.add(characterstic);
    }

    public List<Question> getCharacterstics() {
        return characterstics;
    }

    public List<Question> withCharacterstic(String questionPattern) {
        return characterstics.stream().filter(txt -> txt.getText().
                endsWith(questionPattern)).collect(Collectors.toList());

    }
}
