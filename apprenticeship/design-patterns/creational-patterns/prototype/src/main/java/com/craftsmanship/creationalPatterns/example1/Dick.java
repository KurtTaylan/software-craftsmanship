package com.craftsmanship.creationalPatterns.example1;

public class Dick implements Person{

    private static final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }
}
