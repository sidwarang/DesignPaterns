package com.patterns;

import com.proxy.Image;
import com.proxy.ProxyImage;

/**
 * Created by Siddharth on 2/25/2016.
 */
public class Proxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_img.jpg");
        image.display();
        System.out.println("");
        image.display();
    }
}
