package com.marco.assignment4.part3.singleresponsibility.violate;

public class Phone {
    public void phoneValid(Person person){
        if(incoming(person)){
            System.out.println("Call going through");
        }else{
            System.out.println("Call not going through");
        }
    }

    private boolean incoming(Person person){
        boolean incoming = false;
        if(person.getPhoneNumber() != 021){
            incoming = false; //Stay false
        }else {
            incoming = true;
        }
        return incoming;
    }
}
