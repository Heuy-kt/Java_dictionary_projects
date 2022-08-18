package com.company.udemy.Exercise4;

import java.util.Scanner;

public class TwentyOne {
    public static void main(String[] args) {
        LargestNumber lm = new LargestNumber();
        System.out.println(lm.getMax());
    }
}
class LargestNumber{
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int number = 0;
    int max = 0;
    int getMax(){
        while(count < 11){
            count++;
            number = scanner.nextInt();
            max = Math.max(max, number);
        }
        return max;
    }
}
