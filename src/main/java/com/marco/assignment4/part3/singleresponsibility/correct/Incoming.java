package com.marco.assignment4.part3.singleresponsibility.correct;

public class Incoming {
    public static boolean incoming(Person person){
        boolean incoming = false;
        if(person.getPhoneNumber() != 021){
            incoming = false; //Stay false
        }else {
            incoming = true;
        }
        return incoming;
    }
}
