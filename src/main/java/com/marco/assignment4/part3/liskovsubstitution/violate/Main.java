package com.marco.assignment4.part3.liskovsubstitution.violate;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new Speaker();
        //Cannot Substitute speaker for audioPlayer
        //Speaker should not be a radio.
        audioPlayer.radio();
    }
}
