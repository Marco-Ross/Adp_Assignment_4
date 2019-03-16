package com.marco.assignment4.part1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleTest {
    private Driver driver;
    private Vehicle vehicle;
    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle();
        driver = new Driver("marco", "ross", 50, "b");
    }

    @Test
    public void driverDetails() {
        try{
            String driverDetails = vehicle.driverDetails();
            assertNotNull(driverDetails);
            assertEquals(driverDetails, driver.toString());
        }catch(Exception e){
            fail("EXCEPTION");
        }
    }
}