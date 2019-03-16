package com.marco.assignment4.part2;

//Car class demonstrates delegation in place of inheritance
public class Car { //Previously extended Vehicle(could also implement VehicleInterface)
    private Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    //The delegator
    private Vehicle vehicle = new Vehicle();

    //Methods are the delegate
    public String seats(){
        return vehicle.seats(); //Delegation
    }

    public void drive(){
        System.out.println("I can Drive fast");
    }

    public void printVehicle(){
        drive();
        seats();
        System.out.println(driver.toString());
        System.out.println();
    }
}
