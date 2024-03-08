package com.objects.overiding;

import java.util.Scanner;
public class ATMMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Type: Current or Savings");
        String accountType = sc.next();

        System.out.println("Enter Balance in your account");
        int balance = sc.nextInt();

        System.out.println("Enter if you want to withdraw or deposit");
        String choice = sc.next();

        System.out.println("Enter Amount to withdraw or deposit ");
        int money = sc.nextInt();

        if (accountType.equals("Savings")){
          Account account1 = new Savings(balance);
          if(choice.equals("withdraw")){
              account1.withdraw(money);
          }else{
              account1.deposit(money);
          }

        } else if (accountType.equals("Current")) {
          Account  account2 = new Current(balance);
            if(choice.equals("withdraw")){
                account2.withdraw(money);
            }else{
                account2.deposit(money);
            }
        }
        else{
            Account account = new Account(balance);
        }
    }

}
