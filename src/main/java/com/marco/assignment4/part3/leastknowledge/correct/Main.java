package com.marco.assignment4.part3.leastknowledge.correct;

public class Main {
    Toilet toilet = new Toilet("Wooden", "Ceramic");
    Bathroom bathroom = new Bathroom("Passage", toilet);

    public void toiletMaterial(){
        String getMaterial = bathroom.getToiletMaterial(); //Method Chaining removed for single call for material
        System.out.println(getMaterial);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.toiletMaterial();
    }
}
