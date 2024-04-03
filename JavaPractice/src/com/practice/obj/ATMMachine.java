package com.practice.obj;


import java.util.Scanner;

class ATM{
    double balance;
    int pin = 7878;

    public void checkPin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if(enteredPin == pin)
        {
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }

    public void menu(){
        System.out.println("Enter your Choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if (opt == 2){
            withdrawMoney();
        }
        else if (opt == 3) {
            depositMoney();
        }
        else if (opt==4) {
           return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter Amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance = balance - amount;
            System.out.println("Money withdraw successful");
        }
        menu();

    }
public void depositMoney(){
    System.out.println("Enter the Amount");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();

    balance = balance+amount;
    System.out.println("Money deposited Successful");
    menu();
}

}

public class ATMMachine {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.checkPin();
    }
}
