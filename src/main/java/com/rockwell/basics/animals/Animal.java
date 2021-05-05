package com.rockwell.basics.animals;

public abstract class Animal {

    protected boolean sleepDuringTheDay;
    protected double weight;

    protected Animal() {

    }

    public abstract void giveNoise();

    public void sleep() {
        if (!sleepDuringTheDay) {
            System.out.println(getClass().getSimpleName() + " is a diurnal.");
        } else {
            System.out.println(getClass().getSimpleName() + " is nocturnal.");
        }
    }

    public void eat(double weight) {
        this.weight += weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}