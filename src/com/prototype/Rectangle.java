package com.prototype;

/**
 * Created by Siddharth on 2/18/2016.
 */
public class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }

    public Rectangle(){
        type = "Rectangle";
    }
}
