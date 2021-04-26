package com.rockwell.basics.animals.bird;

import com.rockwell.basics.animals.AnimalWithStripes;

public class Hoopoe extends Bird implements AnimalWithStripes {

    @Override
    public void fly() {

    }

    @Override
    public void giveNoise() {
        System.out.println(getClass().getSimpleName() + " sings \"upupup\" ");
    }

    @Override
    public void hasStripes() {
        System.out.println(getClass().getSimpleName() + "that is the bird with stripes.");

    }
}
