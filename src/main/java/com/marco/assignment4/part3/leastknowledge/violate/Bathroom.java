package com.marco.assignment4.part3.leastknowledge.violate;

public class Bathroom {
    private String bathroomLocation;
    private Toilet toilet;

    public Bathroom(String bathroomLocation, Toilet toilet) {
        this.bathroomLocation = bathroomLocation;
        this.toilet = toilet;
    }

    public String getBathroomLocation() {
        return bathroomLocation;
    }

    public void setBathroomLocation(String bathroomLocation) {
        this.bathroomLocation = bathroomLocation;
    }

    public Toilet getToilet() {
        return toilet;
    }

    public void setToilet(Toilet toilet) {
        this.toilet = toilet;
    }
}
