package com.craftsmanship.creationalPatterns.example2;

public class PrototypeBeta implements Prototype{

    private String name = "BetaVersion";
    @Override
    public Prototype clone() {
        return new PrototypeBeta();
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
