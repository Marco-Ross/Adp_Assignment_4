package com.marco.assignment4.part3.liskovsubstitution.correct;

public class Main {
    public static void main(String[] args) {
        System.out.println("Speaker:");
        AudioPlayer audioPlayer = new Speaker();
        //AudioPlayer can now be substituted with Speaker
        audioPlayer.playMusic();

        System.out.println();
        System.out.println("DvdPlayer:");
        AudioPlayer audioPlayer1 = new DvdPlayer();
        audioPlayer1.playMusic();
        ((DvdPlayer) audioPlayer1).radio();

    }
}
