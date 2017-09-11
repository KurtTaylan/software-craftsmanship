package com.craftsmanship.behavioralPatterns.example;

class UpVisitor implements Visitor {
    public void visit(com.craftsmanship.behavioralPatterns.example.FOO foo) {
        System.out.println("do Up on " + foo.getFOO());
    }

    public void visit(com.craftsmanship.behavioralPatterns.example.BAR bar) {
        System.out.println("do Up on " + bar.getBAR());
    }

    public void visit(BAZ baz) {
        System.out.println("do Up on " + baz.getBAZ());
    }
}
