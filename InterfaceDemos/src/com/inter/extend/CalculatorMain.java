package com.inter.extend;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator calculator = new BasicCalculator();
        calculator.add(2,3);
        calculator.product(5,6);
        IScientific scientific = new ScientificCalc();

    }
}
