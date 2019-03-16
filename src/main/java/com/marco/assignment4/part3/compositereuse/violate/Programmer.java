package com.marco.assignment4.part3.compositereuse.violate;

public class Programmer extends Employee{
    public Programmer(int hoursWorked, int incomePerHour) {
        super(hoursWorked, incomePerHour);
    }
    //All programmers receive the same amount of income
    @Override
    public int money() {
        return super.money();
    }
}
