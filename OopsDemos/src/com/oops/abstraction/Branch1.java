package com.oops.abstraction;

public class Branch1 extends Bank {
    @Override
    void carLoan() {
        System.out.println("car loan in branch1");
    }

    @Override
    void housingLoan() {
        System.out.println("housing loan in branch1");
    }

    @Override
    void eduLoan() {
        System.out.println("edu loan in branch1");
    }

    void staffDetails() {
        System.out.println("staff in branch1");
    }


}
