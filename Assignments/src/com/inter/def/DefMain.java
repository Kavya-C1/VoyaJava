package com.inter.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalculator bonusCalculator = new CalculatorImpl();
        bonusCalculator.calculator(2000);
        bonusCalculator.policyType();
        IBonusCalculator.show();

        IAAllowanceCalculator allowanceCalculator = (IAAllowanceCalculator) bonusCalculator;
        allowanceCalculator.calculator(1000);
        allowanceCalculator.policyType();


    }
}
