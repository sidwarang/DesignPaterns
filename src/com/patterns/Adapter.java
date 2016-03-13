package com.patterns;

import com.adapter.AudioPlayer;

/**
 * Created by Siddharth on 2/18/2016.
 */
public class Adapter {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "song1");
        audioPlayer.play("mp4", "song2");
        audioPlayer.play("vlc", "song3");
        audioPlayer.play("avi", "song4");
    }
}
