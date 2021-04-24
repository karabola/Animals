package com.rockwell.basics.animals;

public abstract class Animal {

    private double weight;

    public abstract void giveNoise();

    public void eat(double weight) {
        this.weight += weight;
    }

}