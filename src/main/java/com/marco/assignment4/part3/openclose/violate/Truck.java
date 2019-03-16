package com.marco.assignment4.part3.openclose.violate;

public class Truck {
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
}
