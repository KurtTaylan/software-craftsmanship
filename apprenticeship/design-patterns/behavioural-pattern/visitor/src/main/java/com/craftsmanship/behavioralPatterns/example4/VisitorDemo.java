package com.craftsmanship.behavioralPatterns.example4;

/**
 * Problem."If you want to add a new Visitable object, you have to change the Visitor interface, and then implement that method in each of your Visitors."
 * <p>
 * Solution. With the ReflectiveVisitor, you only need one method in the Visitor interface - visit(Object). All other visit() methods can be added later as point-to-point coupling is required.
 */
public class VisitorDemo {

    public static void main(String[] args) {
        Element[] list = {new This(), new That(), new TheOther()};
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
