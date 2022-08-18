package com.company.udemy.Exercise4;

public class ThirtyThree {
    public static void main(String[] args) {
        InfiniteLoop infiniteLoop = new InfiniteLoop();

    }
}
class InfiniteLoop {
    void printLoop(){
        int count = 0;
        while(true){
            System.out.println(2*count);
            count++;
        }
    }
}