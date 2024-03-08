package com.objects.overiding;

public class Current extends Account{

    public Current(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
//        super.withdraw(amount);
        System.out.println("withdraw amount: " + amount);
        double charges = 400;
        balance = balance - amount - charges;
        System.out.println("Savings account charges: " + charges + "/n" +"Balance amount: " + balance );
    }

    @Override
    void deposit(double amount) {
//        super.deposit(amount);
        System.out.println("deposit amount: " + amount);
        balance = balance + amount;
        System.out.println( "Balance amount: " + balance );
    }
}
