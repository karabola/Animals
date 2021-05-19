package com.rockwell.basics.animals.mammal;

public class Lion extends Cat {

    protected double weight;

    @Override
    public void giveNoise() {
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat(double weight) {
        this.weight += (1 / 2 * weight);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

