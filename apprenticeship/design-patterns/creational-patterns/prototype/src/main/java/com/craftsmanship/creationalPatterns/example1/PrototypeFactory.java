package com.craftsmanship.creationalPatterns.example1;

public class PrototypeFactory {

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String type: args) {
                Person prototype = Factory.getPrototypes(type);
                if (prototype != null) {
                    System.out.println(prototype);
                }
            }
        }else {
            System.out.println("Run again");
        }
    }
}
