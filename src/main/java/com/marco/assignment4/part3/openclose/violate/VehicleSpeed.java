package com.marco.assignment4.part3.openclose.violate;

import java.util.ArrayList;

public class VehicleSpeed {

    //Returns Speed of Different Trucks in ArrayList
    public String truckSpeed(ArrayList<Truck> truckArray){
        String truckSpeeds="";
        for(int i=0; i<truckArray.size();i++){
            int distance =truckArray.get(i).getDistanceTraveledInKm();
            int time = truckArray.get(i).getTimeInHrs();
            int weight = truckArray.get(i).getTrailerWeightInKg();

            int truckSpeed = distance/time + weight;  //fictional calculation
            truckSpeeds += truckArray.get(i).getTruckName() + "  Speed: " + truckSpeed + "\n";  //Gets name of truck & concatenates it with its speed
        }

        return truckSpeeds;
    }

    //Returns Speed of Different Cars in ArrayList
    public String carSpeed(ArrayList<Car> carArray){
        String carsSpeeds="";
        for(int i=0; i<carArray.size();i++){
            int distance =carArray.get(i).getDistanceTraveledInKm();
            int time = carArray.get(i).getTimeInHrs();

            int carSpeed = distance/time;
            carsSpeeds += carArray.get(i).getCarName() + "  Speed: " + carSpeed + "\n";  //Gets name of car & concatenates it with its speed
        }

        return carsSpeeds;
    }

}
