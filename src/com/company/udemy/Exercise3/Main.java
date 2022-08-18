package com.company.udemy.Exercise3;

import javax.swing.*;

public class Main {
    double balance = 44.9;
    public static void main(String[] args) {

    }
    //exercise 3.11
    public void withDraw(double withdrawnAmount) {
        if (withdrawnAmount < balance)
            balance = balance - withdrawnAmount;
        else
            System.out.println("withdrawal amount exceeded your balance");
    }
}

//exercise 3.12
class invoice{
    public invoice(){

    }
    String partNUmber;
    String partDescription;
    int quantity;
    double price;

    public double getInvoiceAmount(int quantity, double price){
        if(quantity<0)
            return 0;
        return quantity*price;
    }
    public String getPartNUmber() {
        return partNUmber;
    }

    public void setPartNUmber(String partNUmber) {
        this.partNUmber = partNUmber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


