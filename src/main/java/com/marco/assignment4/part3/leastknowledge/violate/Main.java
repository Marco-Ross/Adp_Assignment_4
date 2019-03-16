package com.marco.assignment4.part3.leastknowledge.violate;

public class Main {
    Toilet toilet = new Toilet("Wooden", "Ceramic");
    Bathroom bathroom = new Bathroom("Passage", toilet);

    public void toiletMaterial(){
        String getMaterial = bathroom.getToilet().getToiletMaterial(); //Method Chaining
        System.out.println(getMaterial);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.toiletMaterial();
    }

}
