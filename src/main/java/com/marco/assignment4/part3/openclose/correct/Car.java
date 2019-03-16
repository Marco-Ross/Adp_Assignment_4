package com.marco.assignment4.part3.openclose.correct;

import com.marco.assignment4.part3.openclose.violate.Truck;

import java.util.ArrayList;

public class Car implements Vehicle {
    private String carName;
    private int distanceTraveledInKm;
    private int timeInHrs;

    public Car(String carName, int distanceTraveledInKm, int timeInHrs) {
        this.carName = carName;
        this.distanceTraveledInKm = distanceTraveledInKm;
        this.timeInHrs = timeInHrs;
    }

    public String getCarName() {
        return carName;
    }

    public int getDistanceTraveledInKm() {
        return distanceTraveledInKm;
    }

    public int getTimeInHrs() {
        return timeInHrs;
    }

    @Override
    public String vehicleSpeed() {
        int speed = getDistanceTraveledInKm()/getTimeInHrs();
        return getCarName() + "   " +speed + "\n";
    }
}
