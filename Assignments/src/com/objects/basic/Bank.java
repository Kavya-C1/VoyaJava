package com.objects.basic;

public class Bank {
    double balance;



    public Bank(double balance) {
        this.balance = balance;
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount){
        balance = balance - amount;
        System.out.println("amount withdraw: "+ amount + " balance: " + balance);
    }

    void deposit(double amount){
        balance = balance + amount;
        System.out.println("amount deposit: "+ amount + " balance: " + balance);
    }

    double getBalance(){
        return balance;
    }
}
