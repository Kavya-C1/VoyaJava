package com.inter.def;

public interface IAAllowanceCalculator {
    void calculator(double amount);
    default void policyType(){
        System.out.println("Policy for bonus");
    }
}
