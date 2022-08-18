package com.company.udemy.Exercise4;
import java.util.Scanner;

public class nineteen {
    public static void main(String[] args) {

        SalesCommissionCalculator salary = new SalesCommissionCalculator();
        System.out.println(salary.getTotalSalary());
    }

}
class SalesCommissionCalculator{
    public static Scanner scanner = new Scanner(System.in);
    int salary = 200;
    double totalEarnings = salary+ ((double)9/100 * getTotalSalary());

    public double getTotalSalary(){
        int count = 0;
        double current = 0;
        double totalSales = 0;
        while(current != -1){
            count++;
            System.out.println("Enter sales " +count+" or -1 to qui: ");
            current = scanner.nextDouble();
            totalSales+= current;

        }
        return totalSales;
    }
}
