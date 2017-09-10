package com.craftsmanship.behavioralPatterns.example1.after;

public class ChainDemo {

    public static void main(String[] args) {
        Handler rootChain = new Handler();
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.wrapAround(rootChain);

        for (int i = 1; i < 6; i++) {
            System.out.println("Operation #" + i + ":");
            rootChain.execute(i);
            System.out.println();
        }
    }
}