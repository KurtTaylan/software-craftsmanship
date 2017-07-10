package com.craftsmanship.creationalPatterns.example1;

public class Harry implements Person {

    private static final String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }
}
