package com.rockwell.basics.animals;

public interface Animal {

    void giveNoise();

    void sleep();/* {
        if (!sleepDuringTheDay) {
            System.out.println(getClass().getSimpleName() + " is a diurnal.");
        } else {
            System.out.println(getClass().getSimpleName() + " is nocturnal.");
        }
    }*/

    void eat(double weight); /*{
        this.weight += weight;
    }*/
}