package com.rockwell.basics.animals;

public class Tiger extends Cat implements AnimalWithStripes {

    @Override
    public void giveNoise() {
        super.giveNoise();
        System.out.println(this.getClass().getSimpleName() + " roars");
    }
    @Override
    public void hasStripes() {
        System.out.println("Tiger has striped skin");
    }
}
