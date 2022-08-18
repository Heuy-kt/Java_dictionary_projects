package com.company.udemy.Exercise4;
import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Loop loop = new Loop();
        loop.print();
    }

}

class Loop{
    Scanner scanner = new Scanner(System.in);
    void print(){
        System.out.println("Enter the last number");
        int n = scanner.nextInt();
        System.out.println(n+"\t  "+"10*"+n+"\t"+"100*"+n+"\t"+"1000*"+n);
        int count = 1;
        while(count <= n){
            System.out.println(count+"\t  "+10*count+"\t"+100*count+"\t\t"+1000*count);
            count++;
        }
    }

}
