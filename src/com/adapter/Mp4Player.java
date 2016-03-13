package com.adapter;

/**
 * Created by Siddharth on 2/18/2016.
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing : " + fileName + ".mp4");
    }
}
