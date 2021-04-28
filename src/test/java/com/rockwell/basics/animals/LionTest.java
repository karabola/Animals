package com.rockwell.basics.animals;

import com.rockwell.basics.animals.mammal.Lion;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LionTest {

    Lion lion = new Lion();

    @Test
    public void shouldWeightAsMuchAsEat() {
        //given
        lion.setWeight(10.0);
        //when
        lion.eat(10);
        //then
        assertEquals("Error when eating", 10.0, lion.getWeight());
    }

    @Test
    public void shouldWeightLessThanEat() {
        //given
        lion.setWeight(5.0);
        //when
        lion.eat(10);
        //then
        assertEquals("Error when eating", 5.0, lion.getWeight());
    }

    @Test
    public void shouldWeightMoreThanEat() {
        //given
        lion.setWeight(4.0);
        //when
        lion.eat(2);
        //then
        assertEquals("Error when eating", 4.0, lion.getWeight());
    }
}
