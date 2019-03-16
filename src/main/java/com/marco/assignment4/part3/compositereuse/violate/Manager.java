package com.marco.assignment4.part3.compositereuse.violate;

public class Manager extends Employee{
    public Manager(int hoursWorked, int incomePerHour) {
        super(hoursWorked, incomePerHour);
    }
    //All managers receive the same amount of income
    @Override
    public int money() {
        return super.money();
    }
}
