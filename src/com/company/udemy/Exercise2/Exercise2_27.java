package com.company.udemy.Exercise2;

import java.util.Scanner;

public class Exercise2_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //exercise 2.27
        System.out.println("* * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * *");
        System.out.println();

//        exercise 2.28
        System.out.println("Enter a float");
        float radius = scanner.nextFloat();
        double pi = 3.14159;
        System.out.println("1 for diameter, 2 for circumference, 3 for area");
        int calculation = scanner.nextInt();
        if (calculation == 1) {
            System.out.println("diameter is " + radius * 2);
        } else if (calculation == 2) {
            System.out.println("Circumference is " + 2 * pi * radius);
        } else if (calculation == 3) {
            System.out.println("Area is " + pi * radius * radius);
        } else {
            System.out.println("ERROR!");
        }

//        Exercise 2.29
        System.out.println("Printing the ASCII values of these chars:  A B C a b c 0 1 2 $ * + /");
        System.out.printf("these characters have these int values %d %d %d    %d %d %d    %d %d" +
                        "%d    %d %d %d %d", ((int) 'A'), ((int) 'B'), ((int) 'C'), ((int) 'a'), ((int) 'b'), ((int) 'c'),
                ((int) '0'), ((int) '1'), ((int) '2'), ((int) '$'), ((int) '*'), ((int) '+'), ((int) '/'));
        System.out.println();

        //Exercise 2.30
        System.out.println("Enter just 5 intergers");
        int a = scanner.nextInt();
        String b = a + "";
        int length = b.length();
        if (length > 5) {
            System.out.println("ERROR");
        } else if (length < 5) {
            System.out.println("ERROR");
        } else {
            System.out.printf("%c %c %c %c %c", b.charAt(0), b.charAt(1), b.charAt(2), b.charAt(3), b.charAt(4));
        }
        System.out.println();

//        exercise 2.31
        System.out.println("Printing numbers squares and cubes");
        System.out.printf("%d %d %d \n", 1, 1, 1);

//        exercise 2.32
        System.out.println("Enter an integer five times");
        int input = scanner.nextInt();

    }
}
