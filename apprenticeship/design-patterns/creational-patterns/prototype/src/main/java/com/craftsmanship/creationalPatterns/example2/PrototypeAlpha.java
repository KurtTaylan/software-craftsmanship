package com.craftsmanship.creationalPatterns.example2;

public class PrototypeAlpha implements Prototype{

    private String name = "AlphaVersion";

    @Override
    public Prototype clone() {
        return new PrototypeAlpha();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println(name + " : does something");
    }
}
