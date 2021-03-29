package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Egg;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {


    @Test
    public void testNullaryConstructor(){
        Pilot froilanda = new Pilot("Froilanda");
        String expected = "Froilanda";

        String actual = froilanda.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNullaryConstructor2(){
        Pilot froilanda = new Pilot("Froilanda");
        String expected = "Froilanda";

        String actual = froilanda.getName();

        Assert.assertNotEquals("Froiland", actual);
    }

    @Test
    public void makeNoiseTest(){
        Pilot froilanda = new Pilot("Froilanda");
        String expected = "I'm farmer Froilanda";

        String actual = froilanda.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest2(){
        Pilot froilanda = new Pilot("Froilanda");
        String expected = "I'm farmer Froilan";

        String actual = froilanda.makeNoise();

        Assert.assertNotEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Pilot froilanda = new Pilot("Froilanda");
        FoodInventory food = new FoodInventory();
        Egg egg = new Egg();
        food.add(egg);
        food.add(egg);
        froilanda.eat(egg, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest2(){
        Pilot froilanda = new Pilot("Froilanda");
        FoodInventory food = new FoodInventory();
        Corn corn = new Corn();
        food.add(corn);
        food.add(corn);
        froilanda.eat(corn, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest3(){
        Pilot froilanda = new Pilot("Froilanda");
        FoodInventory food = new FoodInventory();
        Tomato tomato = new Tomato();
        food.add(tomato);
        food.add(tomato);
        froilanda.eat(tomato, food);

        Integer expected = 1;
        Integer actual = food.size();

        Assert.assertEquals(expected, actual);
    }


}