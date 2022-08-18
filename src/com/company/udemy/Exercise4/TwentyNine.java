package com.company.udemy.Exercise4;

public class TwentyNine {
    public static void main(String[] args) {
        Squares squares = new Squares(4);
        squares.printSquare();
    }
}
class Squares{
    int length;

    public Squares(int length) {
        this.length = length;
    }
    void printSquare(){
        int count = 0;
        while(count < this.length){
            String aste = "*  ".repeat(length);
            System.out.println(aste);
            count++;
        }
    }
}
