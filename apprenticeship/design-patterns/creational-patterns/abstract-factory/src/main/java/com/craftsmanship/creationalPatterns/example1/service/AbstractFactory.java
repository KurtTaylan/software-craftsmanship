package com.craftsmanship.creationalPatterns.example1.service;

import com.craftsmanship.creationalPatterns.example1.Architecture;
import com.craftsmanship.creationalPatterns.example1.products.parent.CPU;
import com.craftsmanship.creationalPatterns.example1.products.parent.MMU;

public abstract class AbstractFactory {

    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();


    public static AbstractFactory getFactory(Architecture architecture){
        AbstractFactory factory = null;

        switch (architecture) {
            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
            case EMBER:
                factory = EMBER_TOOLKIT;
                break;
        }

        return factory;
    }


    public abstract CPU createCPU();

    public abstract MMU createMMU();
}
