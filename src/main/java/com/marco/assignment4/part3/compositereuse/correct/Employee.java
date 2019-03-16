package com.marco.assignment4.part3.compositereuse.correct;

public class Employee implements Income{
    protected int hoursWorked;
    protected int incomePerHour;

    public Employee(int hoursWorked, int incomePerHour) {
        this.hoursWorked = hoursWorked;
        this.incomePerHour = incomePerHour;
    }

    @Override
    public int money(){
        return hoursWorked*incomePerHour;
    }

    public static void main(String[] args) {
        Employee employee = new Manager(5,70);
        Employee employee1 = new Programmer(5,70);

        System.out.println("Employee - You earn: " + employee.money());
        System.out.println("Employee1 - You earn: " + employee1.money());
    }
}
