package com.craftsmanship.creationalPatterns.example2;

public class Product extends BaseEntity {

    private int value;

    public Product(int value) {
        this.value = value;
    }

    @Override
    public void traverse(int[] levels) {
        if (printThisLevel(levels))
            System.out.println(indent.toString() + value);

    }
}
