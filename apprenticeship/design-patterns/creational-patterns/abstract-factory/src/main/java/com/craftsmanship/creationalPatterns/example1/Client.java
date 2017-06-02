package com.craftsmanship.creationalPatterns.example1;

import com.craftsmanship.creationalPatterns.example1.products.parent.CPU;
import com.craftsmanship.creationalPatterns.example1.products.parent.MMU;
import com.craftsmanship.creationalPatterns.example1.service.AbstractFactory;

public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architecture.EMBER);

        CPU cpu = factory.createCPU();
        MMU mmu = factory.createMMU();

        System.out.println(cpu);
        System.out.println(mmu);


        // Change The whole architecture by one statement.
        factory = AbstractFactory.getFactory(Architecture.ENGINOLA);

        CPU newCpu = factory.createCPU();
        MMU newMmu = factory.createMMU();

        System.out.println(newCpu);
        System.out.println(newMmu);
    }

}
