package com.abstractfactory;

/**
 * Created by Siddharth on 10/20/2015.
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String colorType) {
        if(colorType==null)
            return null;
        else if(colorType=="Red")
            return new Red();
        else if(colorType=="Blue")
            return new Blue();
        else if(colorType=="Green")
            return new Green();
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
