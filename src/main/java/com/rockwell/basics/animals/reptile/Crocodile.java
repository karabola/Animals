package com.rockwell.basics.animals.reptile;

public class Crocodile extends Reptile {
    @Override
    public void crawl() {
        System.out.println(getClass().getSimpleName() + " crawl very fast.");

    }

    @Override
    public void giveNoise() {
        System.out.println("Is the " + getClass().getSimpleName() + "gives a noise?");

    }
}
