package com.rockwell.basics.animals.mammal;

public class Lion extends Cat {

    @Override
    public void giveNoise() {
    }

    @Override
    public void eat(double weight) {
        super.eat(1 / 2 * weight);
    }
}

