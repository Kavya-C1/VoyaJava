package com.inter.def;

public class CalculatorImpl implements IBonusCalculator, IAAllowanceCalculator {
    @Override
    public void calculator(double amount) {
        System.out.println(amount*5);
    }

    @Override
    public void policyType(){
        System.out.println("Policy for bonus");
        IBonusCalculator.super.policyType();
        IAAllowanceCalculator.super.policyType();
    }
}
