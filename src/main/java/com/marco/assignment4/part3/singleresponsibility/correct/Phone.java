package com.marco.assignment4.part3.singleresponsibility.correct;

public class Phone {
    public void phoneValid(Person person){
        if(Incoming.incoming(person)){
            System.out.println("Call going through");
        }else{
            System.out.println("Call not going through");
        }
    }


}