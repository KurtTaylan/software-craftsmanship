package com.craftsmanship.behavioralPatterns.example4;

class UpVisitor extends ReflectiveVisitor {
    public void visit(Object o) {
        try {
            getMethod(o.getClass()).invoke(this, o);
        } catch (Exception ex) {
            System.out.println( "UpVisitor - no appropriate visit() method" );
        }
    }

    public void visitThis(This element) {
        System.out.println("UpVisitor: do Up on " + element.thiss());
    }

    public void visitObject(Object o) {
        System.out.println("UpVisitor: generic visitObject() method");
    }
}
