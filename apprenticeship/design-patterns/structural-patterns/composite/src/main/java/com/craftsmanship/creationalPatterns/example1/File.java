package com.craftsmanship.creationalPatterns.example1;

// File implements the "lowest common denominator"
public class File implements FileInterface{

    private  String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(CompositeClient.compositeBuilder + name);
    }
}
