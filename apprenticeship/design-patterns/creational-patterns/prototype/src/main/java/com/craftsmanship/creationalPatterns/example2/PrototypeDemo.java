package com.craftsmanship.creationalPatterns.example2;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
        if(args.length > 0 ) {
            initializePrototypes();
            List<Prototype> prototypes = new ArrayList<>();
            for (String protoName: args){
                Prototype prototype = PrototypeModule.createPrototype(protoName);
                if (protoName != null) {
                    prototypes.add(prototype);
                }
            }
            for (Prototype prototype : prototypes){
                prototype.execute();
            }
        } else {
            System.out.println("Run again");
        }
    }

    private static void initializePrototypes() {
        PrototypeModule.addPrototype(new PrototypeAlpha());
        PrototypeModule.addPrototype(new PrototypeBeta());
        PrototypeModule.addPrototype(new ReleasePrototype());
    }
}
