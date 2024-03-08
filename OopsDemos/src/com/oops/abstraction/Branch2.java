package com.oops.abstraction;


public abstract class Branch2 extends Bank{

    @Override
    void housingLoan() {
        System.out.println("housing loan in branch1");
    }

    @Override
    void eduLoan() {
        System.out.println("edu loan in branch1");
    }

    void staffDetails(){
        System.out.println("staff in branch1");
    }

    void loanType(){
        System.out.println("Easy emi loans in branch2");
    }


}
