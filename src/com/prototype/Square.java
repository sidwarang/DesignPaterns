package com.prototype;

/**
 * Created by Siddharth on 2/18/2016.
 */
public class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    public Square(){
        type = "Square";
    }
}
