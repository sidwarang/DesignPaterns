package com.singleton;

/**
 * Created by Siddharth on 10/20/2015.
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();
    private int increment = 0;
    private SingleObject(){
    }

    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public void showMessage(){
        increment++;
        System.out.println("Increment value is: "+increment);
    }
}
