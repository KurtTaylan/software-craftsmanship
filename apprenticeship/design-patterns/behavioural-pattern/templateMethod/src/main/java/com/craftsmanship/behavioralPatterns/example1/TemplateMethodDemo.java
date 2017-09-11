package com.craftsmanship.behavioralPatterns.example1;

/**
 * 1. Standardize the skeleton of an algorithm in a base class "template" method
 * 2. Common implementations of individual steps are defined in the base class
 * 3. Steps requiring peculiar implementations are "placeholders" in base class
 * 4. Derived classes can override placeholder methods
 * 5. Derived classes can override implemented methods
 * 6. Derived classes can override and "call back to" base class methods
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}