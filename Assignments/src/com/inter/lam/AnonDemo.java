package com.inter.lam;

public class AnonDemo {
    public static void main(String[] args) {
        IGreater greater = new GreaterImpl();
        greater.greetMessage("Welcome to Lambda");


    }
}
