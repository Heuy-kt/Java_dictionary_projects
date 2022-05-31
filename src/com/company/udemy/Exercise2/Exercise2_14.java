package com.company.udemy.Exercise2;

import java.util.Scanner;

public class Exercise2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //    exercise 2.14
        System.out.println(max(23,21,34));
        System.out.println("1 2 3 4");
        System.out.print(1 + " ");
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(4 + "\n");
        System.out.printf("%d %d %d %d %n", 1, 2, 3, 4);


        //exercise 2.15
        System.out.println("Enter two integers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int sum = x + y;
        int product = x * y;
        int difference = x - y;
        int quotient = x / y;

        //exercise 2.16

        System.out.println("Enter your integers below");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        if (p == q) {
            System.out.println("These numbers are equal");
        } else if (p > q) {
            System.out.println(p + " is the larger number");
        } else {
            System.out.println(q + " is the larger number");
        }

        //exercise 2.17
        System.out.println("Enter your integers below");
        int r = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        System.out.println(r + s + t);
        System.out.println((r + s + t) / 3);
        System.out.println(r * s * t);

        System.out.println(max(r,s,t));
        System.out.println(min(r,s,t));

        //exercise 2.18
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s",
                "**********", "*        *", "*        *", "*        *", "*        *", "*        *"
                , "*        *", "*        *", "*        *","**********");

        //exercise 25

        System.out.println("enter an integer to determine odd or even");
        int num = scanner.nextInt();
        if(num == 0){
            System.out.println("UNDEFINED");
        } else if(num%2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

        //exercise 2.26
        //multiples of a number are numbers it can perfectly divide
        System.out.println("Enter thr integers");
        int xx = scanner.nextInt();
        int yy = scanner.nextInt();
        if(yy%xx == 0){
            System.out.println("Multiples");
        }else{
            System.out.println("Not Multiples");
        }

    }


    public static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        } else if (b > a) {
            if (b > c) {
                return b;
            }
        }
        return c;
    }
    public static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            }
        } else if (b < a) {
            if (b < c) {
                return b;
            }
        }
        return c;
    }

}

