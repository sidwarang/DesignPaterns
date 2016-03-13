package com.adapter;

/**
 * Created by Siddharth on 2/18/2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing : " + fileName + ".vlc");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
