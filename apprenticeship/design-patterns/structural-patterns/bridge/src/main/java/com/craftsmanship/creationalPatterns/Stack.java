package com.craftsmanship.creationalPatterns;

/*
*
* Create an interface/wrapper class that "has a"
* implementation object and delegates all requests to it
*
* */
public class Stack {

    protected StackImp imp;

    public Stack(String s) {
        if ("java".equals(s)) {
            imp = new StackJava();
        } else {
            imp = new StackMine();
        }
    }

    public Stack() {
        this("java");
    }

    public void push(int in) {
        imp.push(in);
    }

    public int pop() {
        return (Integer) imp.pop();
    }

    public boolean isEmpty() {
        return imp.empty();
    }
}
