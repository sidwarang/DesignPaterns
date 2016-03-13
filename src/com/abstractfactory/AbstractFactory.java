package com.abstractfactory;

/**
 * Created by Siddharth on 10/20/2015.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
