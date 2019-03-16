package com.marco.assignment4.part3.singleresponsibility.violate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("marco", 021);
        Phone phone = new Phone();

        phone.phoneValid(person);
    }
}
