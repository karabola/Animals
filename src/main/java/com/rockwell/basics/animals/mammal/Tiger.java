package com.rockwell.basics.animals.mammal;

import com.rockwell.basics.animals.AnimalWithStripes;

public class Tiger extends Cat implements AnimalWithStripes {

    @Override
    public void giveNoise() {
        System.out.println(this.getClass().getSimpleName() + " roars");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(double weight) {

    }

    @Override
    public void hasStripes() {
        System.out.println("Tiger has striped skin");
    }
}
