package com.marco.assignment4.part3.openclose.violate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        VehicleSpeed vehicleSpeed = new VehicleSpeed();
        String getCarSpeeds = vehicleSpeed.carSpeed(main.cars());
        String getTruckSpeeds = vehicleSpeed.truckSpeed(main.trucks());

        System.out.println(getCarSpeeds);
        System.out.println(getTruckSpeeds);

    }

    //Methods Create Vehicles

    public ArrayList cars(){
        ArrayList<Car> carsArray = new ArrayList<>();

        Car tazz = new Car("Tazz",100, 2);
        Car honda = new Car("Honda",100,3);

        carsArray.add(tazz);
        carsArray.add(honda);

        return carsArray;
    }

    public ArrayList trucks(){
        ArrayList<Truck> trucksArray = new ArrayList<>();

        Truck monster = new Truck("Monster",300, 15, 6000);
        Truck ford = new Truck("Ford",500,10,3000);

        trucksArray.add(monster);
        trucksArray.add(ford);

        return trucksArray;
    }
}
