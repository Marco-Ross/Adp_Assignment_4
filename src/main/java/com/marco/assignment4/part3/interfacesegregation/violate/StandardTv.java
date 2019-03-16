package com.marco.assignment4.part3.interfacesegregation.violate;

public class StandardTv implements Tv{
    @Override
    public void highDefinition() {
        //StandardTv cannot use HighDefinition
    }

    @Override
    public void wifi() {
        //StandardTv cannot use Wifi
    }

    @Override
    public void watch() {
        System.out.println("I can watch Tv");
    }

    @Override
    public void pause() {
        //StandardTv cannot have pause
    }
}
