package com.prototype;

/**
 * Created by Siddharth on 2/18/2016.
 */
public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    public Circle(){
        type = "Circle";
    }
}
