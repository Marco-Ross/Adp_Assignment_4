package com.marco.assignment4.part2;

public class Main {
//Part 2 Demonstrates Delegation, Abstraction and Composition
    public static void main(String[] args) {
        Main main = new Main();
        Driver driver = main.newDriver();

        VehicleInterface bus = new Bus(driver);
        Car car = new Car(driver);

        bus.printVehicle();
        car.printVehicle();

    }
    public Driver newDriver(){
        return new Driver("marco", "ross", 50, "b");
    }

}
