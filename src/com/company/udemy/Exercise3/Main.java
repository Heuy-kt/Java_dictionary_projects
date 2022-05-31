package com.company.udemy.Exercise3;

public class Main {
    public static void main(String[] args) {
        // an if statement
        String queen = "Queen";
        String king = "King";
        var Alexander = true;
        var Moremi = false;

        System.out.println("Alexander the great was a " + (Alexander? king: queen) + "and Queen Moremi was " +
                "a " + (Moremi? king: queen));

        var option = 2;

        switch (option){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("month " + option+ " has 30 days");
                break;

            case 5:
            case 6:
            case 7:
                System.out.println("I don't know the days in the month");

        }

    }
}
