package com.craftsmanship.creationalPatterns.example2;

/**
 * Abstract Factory classes are often implemented with Factory Methods,
 * but they can also be implemented using Prototype. Abstract Factory
 * might store a set of Prototypes from which to clone and return product
 * objects.
 * -Factory Method: creation through inheritance.
 * -Prototype: creation through delegation.
 * -Virtual constructor: defer choice of object to create until run-time.
 */

public class FactoryFmProto {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = null;

        if (args.length > 0)
            abstractFactory = new PCFactory();
        else
            abstractFactory = new NotPCFactory();

        for (int i = 0; i < 3; i++)
            System.out.print(abstractFactory.makePhase() + " ");

        System.out.println();
        System.out.println(abstractFactory.makeCompromise());
        System.out.println(abstractFactory.makeGrade());
    }
}
