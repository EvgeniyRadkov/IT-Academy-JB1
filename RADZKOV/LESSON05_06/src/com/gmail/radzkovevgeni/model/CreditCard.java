package com.gmail.radzkovevgeni.model;

public class CreditCard {
    private int accountNumber;
    private int currentAmount;

    public CreditCard() {
    }

    public CreditCard(int accountNumber, int currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public int creditinMoneyToAnAccount(int accountNumber, int sum) {
        currentAmount += sum;
        return currentAmount;
    }

    public int withDrawingMoneyToAnAccount(int accountNumber, int sum) {
        if (sum <= currentAmount) {
            currentAmount -= sum;
        } else {
            System.out.println("Not enough money in the account!");
        }
        return currentAmount;
    }

    public void printAccountInfotmation() {
        System.out.print("Account number: " + accountNumber + "; ");
        System.out.println("Account balance: " + currentAmount);
    }

}
