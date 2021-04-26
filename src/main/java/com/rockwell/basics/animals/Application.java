package com.rockwell.basics.animals;

import com.rockwell.basics.animals.bird.Hoopoe;
import com.rockwell.basics.animals.mammal.Lion;
import com.rockwell.basics.animals.mammal.Tiger;

public class Application {
    public static void main(String[] args) {

        Tiger tiger = new Tiger();
        tiger.giveNoise();
        tiger.hasStripes();

        Animal lion = new Lion();

        Hoopoe hoopoe = new Hoopoe();
        hoopoe.giveNoise();
    }
}
