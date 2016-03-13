package com.patterns;
import com.abstractfactory.*;
/**
 * Created by Siddharth on 10/20/2015.
 */
public class AbstractFactory {
    public static void main(String[] args) {
        com.abstractfactory.AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Circle");
        shape3.draw();

        com.abstractfactory.AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color color1 = colorFactory.getColor("Red");
        color1.fill();

        Color color2 = colorFactory.getColor("Blue");
        color2.fill();

        Color color3 = colorFactory.getColor("Green");
        color3.fill();
    }
}
