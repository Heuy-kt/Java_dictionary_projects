package com.company.udemy.Exercise4;

public class Main {
    public static void main(String[] args) {
        //4.3
         int x = 1;
         x=x+1;
         x++;
         x+=1;
         ++x;

         //4.4
        x = 1;
        int y=1;
        int z = x+y;
        x++;

        int count = z;
        if(count>10)
            System.out.println("Count is greater than 10");
        x =10;
        x--;
        int total = 20;
        total =-x;


    }
}
