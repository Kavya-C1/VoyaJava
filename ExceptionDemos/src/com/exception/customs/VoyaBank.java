package com.exception.customs;

public class VoyaBank {
    double balance;

    public VoyaBank(double balance) {
        super();
        this.balance = balance;
    }

    void withdraw(double amount) throws OutOfLimitsException, NegativeBalanceException {
        try{
            if(balance-amount<=0){
                throw new NegativeBalanceException("balance is negative");
            }
            if(amount>1000){
                throw new OutOfLimitsException("Limits exceeded");
            }
            balance = balance - amount;
            System.out.println("Balance " + balance);
        }catch(NegativeBalanceException e){
            System.out.println("exception.."+e.getMessage());
            throw e;
        }catch (OutOfLimitsException e){
            System.out.println("exception.."+e.getMessage());
            throw e;
        }finally {
            System.out.println("close db");
        }
        System.out.println("work done");
    }
}
