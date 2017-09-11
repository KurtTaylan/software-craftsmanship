package com.craftsmanship.behavioralPatterns.example3;

public class VisitorDemo {
    public static void main(String[] args) {
        Base objects[] = {new FOO(), new BAR(), new BAZ()};
        for (Base object : objects) {
            for (int j = 0; j < 3; j++) {
                object.execute(objects[j]);
            }
            System.out.println();
        }
    }
}
