package com.bankproject;

//interface defining common bank operation
public interface BankAccountInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    String getAccountHolder();
    void setAccountHolder(String name);
}