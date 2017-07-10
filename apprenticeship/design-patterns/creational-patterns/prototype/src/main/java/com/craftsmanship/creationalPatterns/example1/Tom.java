package com.craftsmanship.creationalPatterns.example1;

public class Tom implements Person{

    private static final String NAME = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return NAME;
    }


}
