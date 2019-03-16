package com.marco.assignment4.part3.interfacesegregation.correct;

public class HdTv implements SmartTv{
    @Override
    public void highDefinition() {
        System.out.println("I see in HD");
    }

    @Override
    public void wifi() {
        System.out.println("I can use WIFI on the TV");
    }

    @Override
    public void pause() {
        System.out.println("I can pause my movies");
    }

    @Override
    public void watch() {
        System.out.println("I can watch Tv");
    }
}
