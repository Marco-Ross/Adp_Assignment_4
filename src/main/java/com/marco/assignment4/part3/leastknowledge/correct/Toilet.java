package com.marco.assignment4.part3.leastknowledge.correct;

public class Toilet {
    private String seat;
    private String toiletMaterial;

    public Toilet() {
    }

    public Toilet(String seat, String toiletMaterial) {
        this.seat = seat;
        this.toiletMaterial = toiletMaterial;
    }

    public String getSeat() {
        return seat;
    }

    public String getToiletMaterial() {
        return toiletMaterial;
    }
}
