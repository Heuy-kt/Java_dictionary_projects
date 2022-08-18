package com.company.udemy.Exercise4;
import java.util.Scanner;

public class TwentyThree {
    public static void main(String[] args) {
        LargestTwo largestTwo = new LargestTwo();
        largestTwo.getMax();

    }
}

class LargestTwo{
    Scanner scanner = new Scanner(System.in);
    int count = 1;
    int number = 0;
    int max = 0;
    int max2 = 0;
    String getMax(){
        while(count <= 10){
            number = scanner.nextInt();
            max = Math.max(max, number);
            if(number < max){
                max2 = Math.max(max2, number);
            }

            count++;
        }
        return max+" and "+max2;
    }
}
