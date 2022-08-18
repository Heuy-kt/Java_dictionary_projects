package com.company.udemy.Exercise4.seventeen;

import java.util.Scanner;

public class GasMileage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int activeTrip = 1;
        int count =1;
        double totalMilesPerGallon = 0;
        while(activeTrip != 0){
            System.out.println("Enter miles of trip"+count);
            int miles = scanner.nextInt();
            System.out.println("Enter gallons of trip"+count);
            int gallons = scanner.nextInt();
            double milesPerGallon = (double)miles/gallons;
            System.out.println("Miles per gallon is " + milesPerGallon);
            totalMilesPerGallon+=milesPerGallon;
            System.out.println("Enter 0 to quit");
            activeTrip = scanner.nextInt();

        }
        System.out.println("Total miles per gallon is " +totalMilesPerGallon);
    }
}

//Algorithm
/*
    miles driven
    gallon exceeded
    input miles driven
    input gallons exceeded;
    display miles/gallon as miles per gallon
    print total miles per gallon for the trip.
*/
class TGasMileage {
    int miles;
    int gallons;
    double milesPerGallon = (double)miles/gallons;


    public double getMilesPerGallon(){
        return milesPerGallon;
    }



}
