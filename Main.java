package com.bankproject; //this file is part of this package

public class Main {
    public static void main(String[] args) {

        //creating an object of BankAccount
        BankAccount acc = new BankAccount ("Chunchun", 378299);

        //using methods
        acc.deposit(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}