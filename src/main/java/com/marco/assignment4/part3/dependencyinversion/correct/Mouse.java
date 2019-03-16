package com.marco.assignment4.part3.dependencyinversion.correct;

public class Mouse implements Click {
    @Override
    public void leftClick() {
        System.out.println("Left Click");
    }

    @Override
    public void rightClick() {
        System.out.println("Right Click");
    }

    @Override
    public void middleClick() {
        System.out.println("Middle Click");
    }
}
