package com.marco.assignment4.part3.openclose.correct;

import java.util.ArrayList;

public class Truck implements Vehicle{
    private String truckName;
    private int distanceTraveledInKm;
    private int timeInHrs;
    private int trailerWeightInKg;

    public Truck(String truckName, int distanceTraveledInKm, int timeInHrs, int trailerWeightInKg) {
        this.truckName = truckName;
        this.distanceTraveledInKm = distanceTraveledInKm;
        this.timeInHrs = timeInHrs;
        this.trailerWeightInKg = trailerWeightInKg;
    }

    public String getTruckName() {
        return truckName;
    }

    public int getDistanceTraveledInKm() {
        return distanceTraveledInKm;
    }

    public int getTimeInHrs() {
        return timeInHrs;
    }

    public int getTrailerWeightInKg() {
        return trailerWeightInKg;
    }

    @Override
    public String vehicleSpeed() {
        int truckSpeed = getDistanceTraveledInKm()/getTimeInHrs() + getTrailerWeightInKg();  //fictional calculation
        return getTruckName() + "   " + truckSpeed + "\n";
    }
}
