package com.marco.assignment4.part2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DriverTest {
    Driver driver;
    @Before
    public void setUp() throws Exception {
        this.driver = new Driver("marco", "ross", 50, "b");
    }

    //Check toString is displaying correct data
    @Test
    public void toStringTest() {
        String toString = driver.toString();
        assertTrue(toString.contains("Driver: name= marco, surname= ross, age= 50, licenseCode= b"));
    }
}