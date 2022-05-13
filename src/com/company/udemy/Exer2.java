package com.company.udemy;

import java.util.Scanner;

public class Exer2 {
    //exercise2.6 :Using the statements you wrote in Exercise 2.5, write a complete program that calculates
    //and prints the product of three integers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();

        System.out.println("Enter third number");
        int c = scanner.nextInt();

        int d = a+b+c;
        System.out.println("Sum = " +d);
    }

}
