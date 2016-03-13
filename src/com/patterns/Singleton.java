package com.patterns;
import com.singleton.SingleObject;
/**
 * Created by Siddharth on 10/15/2015.
 */
public class Singleton {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getSingleObject();
        singleObject.showMessage();

        SingleObject singleObject2 = SingleObject.getSingleObject();
        singleObject2.showMessage();
    }
}
