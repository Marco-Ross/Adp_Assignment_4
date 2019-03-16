package com.marco.assignment4.part1;

public class Driver {
    private String name;
    private String surname;
    private int age;
    private String licenseCode;

    public Driver(String name, String surname, int age, String licenseCode) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.licenseCode = licenseCode;
    }

    @Override
    public String toString() {
        return "Driver: " + "name= " + name + ", surname= " + surname + ", age= " + age + ", licenseCode= " + licenseCode;
    }
}
