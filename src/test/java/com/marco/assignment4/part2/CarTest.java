package com.marco.assignment4.part2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Vehicle vehicle;
    private Car car;
    private Driver driver;

    @Before
    public void setUp() throws Exception {
        this.driver = new Driver("marco", "ross", 50, "b");
        this.car = new Car(driver);
        this.vehicle = new Vehicle();
    }

    @Test
    public void testCarInheritanceCreation() {
        try{
            assertSame(car.seats(),vehicle.seats()); //Check if object is being called
        }catch(Exception e){
            fail("EXCEPTION");
        }
    }

}