package com.craftsmanship.creationalPatterns.example1.service;

import com.craftsmanship.creationalPatterns.example1.products.EmberCPU;
import com.craftsmanship.creationalPatterns.example1.products.EmberMMU;
import com.craftsmanship.creationalPatterns.example1.products.parent.CPU;
import com.craftsmanship.creationalPatterns.example1.products.parent.MMU;

public class EmberToolkit extends AbstractFactory {


    @Override
    public CPU createCPU() {
        return new EmberCPU();
    }

    @Override
    public MMU createMMU() {
        return new EmberMMU();
    }
}
