package com.craftsmanship.creationalPatterns.example1;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("top", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototypes(String type){
        try {
            return prototypes.get(type).clone();
        }catch (NullPointerException e){
            System.out.println("Prototype with name: " + type + " , doesn't exist");
            return null;
        }
    }
}
