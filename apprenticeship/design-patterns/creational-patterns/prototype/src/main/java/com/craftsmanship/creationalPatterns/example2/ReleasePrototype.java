package com.craftsmanship.creationalPatterns.example2;

public class ReleasePrototype implements Prototype{

    private String name = "ReleaseCandidate";

    @Override
    public Prototype clone() {
        return new ReleasePrototype();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println(name + ": does real work");
    }
}
