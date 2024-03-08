package com.exception.basics;

public class ATMMain {
    public static void main(String[] args) {
        System.out.println("welcome");
        Bank bank = new Bank();
        try{
            bank.withdraw(2200);
            System.out.println("Amount Withdrawn");
        } catch (Exception e) {
            System.out.println("exception...");
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
