package com.craftsmanship.structuralPatterns.example1;

class Gazillion {
    private int row;

    public Gazillion(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    void report(int col) {
        System.out.print(" " + row + col);
    }
}
