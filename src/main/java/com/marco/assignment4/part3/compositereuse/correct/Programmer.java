package com.marco.assignment4.part3.compositereuse.correct;

public class Programmer extends Employee implements Income {
    public Programmer(int hoursWorked, int incomePerHour) {
        super(hoursWorked, incomePerHour);
    }

    @Override
    public int money() {
        return super.money();
    }
}
