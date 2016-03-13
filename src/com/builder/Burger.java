package com.builder;

/**
 * Created by Siddharth on 2/17/2016.
 */
public abstract class Burger implements Item{

    public Packing packing(){
        return new Wrapper();
    }

    public abstract float price();
}
