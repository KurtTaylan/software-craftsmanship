package com.craftsmanship.creationalPatterns.example2;

public abstract class AbstractFactory {

    protected Expression prototype;

    public Expression makePhase(){
        return prototype.clone();
    }

    abstract Expression makeCompromise();
    abstract Expression makeGrade();
}
