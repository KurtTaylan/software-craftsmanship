package com.craftsmanship.creationalPatterns.example1.service;

import com.craftsmanship.creationalPatterns.example1.products.EnginolaCPU;
import com.craftsmanship.creationalPatterns.example1.products.EnginolaMMU;
import com.craftsmanship.creationalPatterns.example1.products.parent.CPU;
import com.craftsmanship.creationalPatterns.example1.products.parent.MMU;

public class EnginolaToolkit extends AbstractFactory {


    @Override
    public CPU createCPU() {
        return new EnginolaCPU();
    }

    @Override
    public MMU createMMU() {
        return new EnginolaMMU();
    }
}
