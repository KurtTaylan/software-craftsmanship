package com.craftsmanship.structuralPatterns.example1;

import java.util.ArrayList;

// Directory implements the "lowes common denominator"
public class Directory implements FileInterface {

    private String name;
    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object object) {
        includedFiles.add(object);
    }

    @Override
    public void ls() {
        System.out.println(CompositeClient.compositeBuilder + name);
        CompositeClient.compositeBuilder.append("   ");
        for (Object includedFile : includedFiles) {
            // Leverage the "lowest common denominator"
            FileInterface obj = (FileInterface) includedFile;
            obj.ls();
        }
        CompositeClient.compositeBuilder.setLength(CompositeClient.compositeBuilder.length() - 3);
    }
}
