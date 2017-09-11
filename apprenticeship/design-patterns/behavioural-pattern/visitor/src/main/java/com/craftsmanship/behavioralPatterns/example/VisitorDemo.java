package com.craftsmanship.behavioralPatterns.example;

/**
 * 1. Add an accept(Visitor) method to the "element" hierarchy
 * 2. Create a "visitor" base class w/ a visit() method for every "element" type
 * 3. Create a "visitor" derived class for each "operation" to do on "elements"
 * 4. Client creates "visitor" objects and passes each to accept() calls
 */
public class VisitorDemo {

    public static void main(String[] args) {
        Element[] list = {new com.craftsmanship.behavioralPatterns.example.FOO(), new com.craftsmanship.behavioralPatterns.example.BAR(), new BAZ()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (Element element : list) {
            element.accept(up);
        }
        for (Element element : list) {
            element.accept(down);
        }
    }
}
