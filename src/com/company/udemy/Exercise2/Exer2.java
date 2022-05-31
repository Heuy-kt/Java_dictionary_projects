package com.company.udemy.Exercise2;

import java.util.Scanner;

public class Exer2 {
    //exercise2.6 :Using the statements you wrote in Exercise 2.5, write a complete program that calculates
    //and prints the product of three integers.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //exercise 2.3a
        int ca, thisIsAVariable, q76354,  number;

        //exercise 2.3b
        System.out.println("Enter an integer");

        //exercise 2.3c
        int value = input.nextInt();

        //exercise 2.3d
        System.out.println("This is a Java program");

        //exercise 2.4

        int c =2;
        // no semiclomn after if statement
        if (c < 7)
        System.out.println("c is less than 7");
        if (c >= 7)   //greater than before equal to
        System.out.println("c is equal to or greater than 7");

//        exercise 2.5

        System.out.println("Enter first number");
        int x = input.nextInt();

        System.out.println("Enter second number");
        int y = input.nextInt();

        System.out.println("Enter third number");
        int z = input.nextInt();

        int result = x*y*z;
        System.out.println("product is " +result);
    }

}
