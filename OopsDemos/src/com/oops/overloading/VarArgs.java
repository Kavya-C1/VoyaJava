package com.oops.overloading;

public class VarArgs {

    void calcSum(String name, int... marks){
        System.out.println("Welcome " + name);
        int sum = 0;
        for(int mark : marks)
            sum +=mark;
        System.out.println("Sum " + sum);
    }

    void calcSum(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        VarArgs demo = new VarArgs();
        demo.calcSum("Sri", 90, 80, 90);
        demo.calcSum("Priya");
        demo.calcSum("Roni", 90, 80);
    }

}
