package com.marco.assignment4.part1;

public class Main {

    public static void main(String[] args) {
        //Polymorphism
        Vehicle bus = new Bus();
        Vehicle car = new Car();

        bus.printVehicle();
        car.printVehicle();
    }

}
