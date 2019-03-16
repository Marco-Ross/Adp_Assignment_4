package com.marco.assignment4.part3.openclose.correct;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle tazz = new Car("Tazz",100, 2);
        Vehicle honda = new Car("Honda",100,3);

        Vehicle monster = new Truck("Monster",300, 15, 6000);
        Vehicle ford = new Truck("Ford",500,10,3000);

        vehicles.add(tazz);
        vehicles.add(honda);
        vehicles.add(monster);
        vehicles.add(ford);

        for(int i=0;i<vehicles.size();i++){
            System.out.println(vehicles.get(i).vehicleSpeed());
        }
    }
}
