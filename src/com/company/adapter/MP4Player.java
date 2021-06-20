package com.company.adapter;

public class MP4Player implements MoviePlayer{

    @Override
    public void play() {
        System.out.println("Playing mp4 file...");
    }
}
