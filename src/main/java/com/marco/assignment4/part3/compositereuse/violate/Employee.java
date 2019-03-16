package com.marco.assignment4.part3.compositereuse.violate;

public class Employee {
    private int hoursWorked;
    private int incomePerHour;

    public Employee(int hoursWorked, int incomePerHour) {
        this.hoursWorked = hoursWorked;
        this.incomePerHour = incomePerHour;
    }

    public int money(){
        return hoursWorked*incomePerHour;
    }

    public static void main(String[] args) {
        Employee employee = new Manager(5,70);
        System.out.println("Employee - You earn: " + employee.money());
    }
}
