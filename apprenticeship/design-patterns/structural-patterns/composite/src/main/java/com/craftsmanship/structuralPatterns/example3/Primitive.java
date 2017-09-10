package com.craftsmanship.structuralPatterns.example3;

// 2. "is a" relationship
public class Primitive implements Component {

    private int value;

    public Primitive(int value) {
        this.value = value;
    }

    @Override
    public void traverse() {
        System.out.println(value + "  ");
    }
}
