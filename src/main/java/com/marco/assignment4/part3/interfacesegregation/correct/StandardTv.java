package com.marco.assignment4.part3.interfacesegregation.correct;

public class StandardTv implements Tv{
    @Override
    public void watch() {
        System.out.println("I can watch Tv");
    }
}
