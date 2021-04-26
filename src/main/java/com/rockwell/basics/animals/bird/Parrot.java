package com.rockwell.basics.animals.bird;

public class Parrot extends Bird {

    @Override
    public void fly() {
        System.out.println("Fly, fly, fly...");

    }

    @Override
    public void giveNoise() {
        System.out.println(getClass().getSimpleName() + "is noisy.");
    }
}
