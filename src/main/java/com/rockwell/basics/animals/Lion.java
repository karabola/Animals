package com.rockwell.basics.animals;

public class Lion extends Cat {

    @Override
    public void eat(double weight) {
        super.eat(1 / 2 * weight);
    }
}

