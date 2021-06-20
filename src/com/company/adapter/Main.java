package com.company.adapter;

public class Main {

    public static void main(String[] args) {

        MoviePlayer moviePlayer = new MP3Player();
        moviePlayer.play();

        MoviePlayer moviePlayer1 = new MP4Player();
        moviePlayer1.play();

        ImageAdaptor imageAdaptor = new ImageAdaptor();
        imageAdaptor.play();
    }
}
