package com.objects.overiding;

public class Savings extends Account{
    public Savings(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
//        super.withdraw(amount);
        System.out.println(amount);
        double charges = 100;
        balance = balance - amount - charges;
        System.out.println("Savings account charges: " + charges +" " + "Balance amount: " + balance );
    }

    @Override
    void deposit(double amount) {
//        super.deposit(amount);
        System.out.println(amount);
        balance = balance + amount;
        System.out.println("Balance amount: " + balance );
    }
}
