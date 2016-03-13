package com.abstractfactory;

/**
 * Created by Siddharth on 10/20/2015.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType==null)
            return null;
        else if(shapeType=="Rectangle")
            return new Rectangle();
        else if(shapeType=="Square")
            return new Square();
        else if(shapeType=="Circle")
            return new Circle();
        return null;
    }
}
