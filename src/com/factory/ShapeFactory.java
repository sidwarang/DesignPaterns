package com.factory;

/**
 * Created by Siddharth on 10/20/2015.
 */
public class ShapeFactory {
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
