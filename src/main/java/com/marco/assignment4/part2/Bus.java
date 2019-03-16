package com.marco.assignment4.part2;

//Bus class uses an interface to demonstrate inheritance alternative (Composition)
public class Bus implements VehicleInterface{
    private Driver driver;

    public Bus(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("I can Drive");
    }

    @Override
    public void seats(){
        System.out.println("The seats are HARD");
    }

    @Override
    public void printVehicle(){
        drive();
        seats();
        System.out.println(driver.toString());
        System.out.println();
    }
}
