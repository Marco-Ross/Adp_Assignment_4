package com.marco.assignment4.part2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    private Driver driver;
    private Main main;

    @Before
    public void setUp() throws Exception {
        this.main = new Main();
        this.driver = new Driver("marco", "ross", 50, "b");
    }

    @Test
    public void main() {
        try{
            assertNotNull(main.newDriver());
            assertEquals(main.newDriver().toString(), driver.toString());
        }catch(Exception e){
            fail("EXCEPTION");
        }
    }
}