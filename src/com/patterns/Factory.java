package com.patterns;
import com.factory.*;
/**
 * Created by Siddharth on 10/20/2015.
 */
public class Factory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = factory.getShape("Square");
        shape2.draw();

        Shape shape3 = factory.getShape("Circle");
        shape3.draw();
    }
}
