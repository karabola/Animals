package com.rockwell.basics.animals.reptile;

public class Snake extends Reptile {

    @Override
    public void crawl() {
        System.out.println(getClass().getSimpleName() + "is very fast.");
    }

    @Override
    public void giveNoise() {
        System.out.println("SSsssssssssssssssss");
    }
}
