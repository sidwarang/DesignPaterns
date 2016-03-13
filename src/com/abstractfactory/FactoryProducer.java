package com.abstractfactory;

/**
 * Created by Siddharth on 10/20/2015.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType=="Shape") {
            return new ShapeFactory();
        }
        else if(factoryType=="Color"){
            return new ColorFactory();
        }
        return null;
    }
}
