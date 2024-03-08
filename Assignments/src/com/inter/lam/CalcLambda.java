package com.inter.lam;

public class CalcLambda {
    public static void main(String[] args) {
//        IMyCalculator icalculate = (int x, int y) ->{
//            System.out.println("Add "+(x+y));
//        };
//        icalculate.calculator(2,3);
//
//        icalculate = (x,y)

        IMyCalculator mycalc = (int x, int y) ->{
          int sum = x+y;
          return sum;
        };
        System.out.println(mycalc.calculator(1,2));


        mycalc = (x, y)-> x*y;
    }
}
