package com.exception.customs;

public class VoyaATM {
    public static void main(String[] args) throws OutOfLimitsException, NegativeBalanceException {
        System.out.println("In Voya ATM");
        VoyaBank voyaBank = new VoyaBank(10000);
        voyaBank.withdraw(1000);
        try{
            voyaBank.withdraw(1000);
            System.out.println("Amount withdraw");
        } catch(NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }catch (OutOfLimitsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("GoodBye");
    }
}
