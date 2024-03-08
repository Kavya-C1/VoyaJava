package com.inter.def;

public interface IBonusCalculator {
    void calculator(double amount);
    default void policyType(){
        System.out.println("Policy for bonus");
    }
    static void show(){
        System.out.println("show the data");
    }

}
