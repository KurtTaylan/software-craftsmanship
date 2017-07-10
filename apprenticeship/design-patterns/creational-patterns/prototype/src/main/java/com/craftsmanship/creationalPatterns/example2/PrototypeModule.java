package com.craftsmanship.creationalPatterns.example2;

import java.util.ArrayList;
import java.util.List;

public class PrototypeModule {

    public static List<Prototype> prototypeList = new ArrayList<>();

    public static void addPrototype(Prototype prototype) {
        prototypeList.add(prototype);
    }

    public static Prototype createPrototype(String name) {
        for (Prototype prototype : prototypeList) {
            if (prototype.getName().equals(name))
                return prototype.clone();
        }

        System.out.println(name + " doesn't exist");
        return null;
    }

}
