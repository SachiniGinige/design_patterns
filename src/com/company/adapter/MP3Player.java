package com.company.adapter;

public class MP3Player implements MoviePlayer{

    @Override
    public void play() {
        System.out.println("Playing mp3 file...");
    }
}
