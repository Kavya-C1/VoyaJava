package com.oops.abstraction;

public class SubBranch extends Branch2 {
    @Override
    void carLoan() {
        System.out.println("car loan in sub branch");
    }

    void subPay(){
        System.out.println("payment in subbranch");
    }
}
