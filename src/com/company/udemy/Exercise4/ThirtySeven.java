package com.company.udemy.Exercise4;

public class ThirtySeven {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
    }
}

class Factorial{
    int factorial(int i){
        if(i==0)
            return 1;
        return i*(factorial(i-1));
    }

    double constantE(int e){
        int ee=1;
        int count = 1;
        while(count<e){
            ee+=((double)1/factorial(count));
            count++;
        }
        return ee;
    }


}
