package com.marco.assignment4.part3.liskovsubstitution.correct;

public class DvdPlayer extends RadioPlayer{
    @Override
    public void radio() {
        super.radio();
    }

    @Override
    public void playMusic() {
        super.playMusic();
    }
}
