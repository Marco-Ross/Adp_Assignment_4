package com.marco.assignment4.part3.liskovsubstitution.correct;

//Doesnt inherit from Radio, since Speaker is only an AudioPlayer
//Does not change the base Class behaviour, or cause errors
public class Speaker extends AudioPlayer{
    @Override
    public void playMusic() {
        super.playMusic();
    }
}
