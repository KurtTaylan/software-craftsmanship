package com.craftsmanship.structuralPatterns.example3;

public class Column extends Composite {

    public Column(int value) {
        super(value);
    }

    @Override
    public void traverse() {
        System.out.println("Column");
        super.traverse();
    }
}
