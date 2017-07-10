package com.craftsmanship.creationalPatterns.example2;

public interface Prototype {

    Prototype clone();
    String getName();
    void execute();
}
