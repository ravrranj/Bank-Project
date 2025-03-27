package com.bankproject; //user define package that we have created 

// Implementing the interface in BankAccount class 
public class BankAccount implements BankAccountInterface {
    private String accountHolder;
    private double balance; //Private variable (Encapsulation)

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = Math.max(initialBalance, 0); //Ensure no negative balance 
    }

    //Implementing interface methods
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public String getAccountHolder() {
        return accountHolder;
    }
    @Override
    public void setAccountHolder(String name) {
        if (name.length() > 2) {
            this.accountHolder = name;
        } else {
            System.out.println("Name too short!");
        }
    }

}