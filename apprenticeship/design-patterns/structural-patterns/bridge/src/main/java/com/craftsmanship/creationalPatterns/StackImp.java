package com.craftsmanship.creationalPatterns;

/*
* Create an implementation/body base class
* */
public interface StackImp {

    Object push(Object o);

    Object peek();

    boolean empty();

    Object pop();
}
