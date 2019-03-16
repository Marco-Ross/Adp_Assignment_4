package com.marco.assignment4.part3.openclose.violate;

public class Car {
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
}
