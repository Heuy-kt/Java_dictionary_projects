package com.company.udemy.Exercise4;

public class Eighteen {

}
class CreditLimitedCalculator{
    int accountId;
    int beginningBalance;
    int creditLimit = 300;
    int customerCharges;
    int totalCreditApplied;

    public CreditLimitedCalculator(int accountId, int beginningBalance, int customerCharges, int totalCreditApplied) {
        this.accountId = accountId;
        this.beginningBalance = beginningBalance;
        this.customerCharges = customerCharges;
        this.totalCreditApplied = totalCreditApplied;
    }

    public int getBalance(){
        return beginningBalance+customerCharges-totalCreditApplied;
    }
    public String displayCreditLimit(){
        if(getBalance()>creditLimit){
            return "Credit Limit Exceeded";
        }
        return "";
    }

}
