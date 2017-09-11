package com.craftsmanship.behavioralPatterns.example;

class DownVisitor implements Visitor {
    public void visit(com.craftsmanship.behavioralPatterns.example.FOO foo) {
        System.out.println("do Down on " + foo.getFOO());
    }

    public void visit(com.craftsmanship.behavioralPatterns.example.BAR bar) {
        System.out.println("do Down on " + bar.getBAR());
    }

    public void visit(BAZ baz) {
        System.out.println("do Down on " + baz.getBAZ());
    }
}
