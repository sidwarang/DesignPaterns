package com.builder;

/**
 * Created by Siddharth on 2/17/2016.
 */
public abstract class ColdDrink implements Item{
    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();
}
