package com.craftsmanship.structuralPatterns.example3;

/*
*  Two different kinds of "container" class. Most of the
*  "meat" is in the Composite base class.
* */
public class Row extends Composite{


    public Row(int value) {
        super(value);
    }

    public void traverse() {
        System.out.println("Row");
        super.traverse();
    }
}
