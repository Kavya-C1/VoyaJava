package com.exception.basics;

public class Bank {
    double balance;
    void withdraw(int amount) throws Exception {
        System.out.println("Bank");
        try{
            if(amount>1000)
                throw new Exception("amount is greater than 1000");
            balance = 8000-amount;
            System.out.println(balance);
        }catch (Exception e) {
            System.out.println("error.....");
            throw e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("completed");
    }
}
