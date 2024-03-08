package com.objects.basic;

import  java.util.Scanner;
public class AtmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank(30000);
        System.out.println("Enter withdraw to draw money or deposit to deposit money");
        String choice = sc.next();

        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice){
            case "withdraw" :
                bank.withdraw(amount);
                break;

            case "deposit" :
                bank.deposit(amount);
                break;

            default:
                System.out.println("Enter correct option");
        }
    }
}
