package com.company.udemy.Exercise3.thirteen;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Doe", 400.00);
        Employee mary = new Employee("Mary", "jane", 300.00);
        System.out.println("John's yearly salary: "+john.getSalary()*12);
        System.out.println("Mary's yearly salary: "+mary.getSalary()*12);
        //increasing by 10%
        double johnSalary = john.getSalary() + (john.getSalary()*(double)10/100);
        double marySalary = mary.getSalary()+ (mary.getSalary()*(double)10/100);
        john.setSalary(johnSalary);
        mary.setSalary(marySalary);
        System.out.println("John's yearly salary: "+john.getSalary()*12);
        System.out.println("Mary's yearly salary: "+mary.getSalary()*12);

    }
}
