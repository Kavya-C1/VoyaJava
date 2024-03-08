package com.objects.overiding;

public class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount){
        System.out.println("Printing withdraw amount: ");
    }

    void deposit(double amount){
        System.out.println("Printing deposit amount: ");
    }

    double getBalance(){
        return  balance;
    }
}
