package com.marco.assignment4.part3.compositereuse.correct;

public class Manager extends Employee implements Income {
    public Manager(int hoursWorked, int incomePerHour) {
        super(hoursWorked, incomePerHour);
    }

    @Override
    public int money() {
        return hoursWorked*incomePerHour + 1000;
    }
}
