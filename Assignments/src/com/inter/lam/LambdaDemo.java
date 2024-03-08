package com.inter.lam;

public class LambdaDemo {
    public static void main(String[] args) {
        //implements using lambda expressions
        IGreater greet = (String message)->{
            System.out.println(message);
        };
        //call the method
        greet.greetMessage("Great Day");

        greet = message -> System.out.println(message+"!!!!");
        greet.greetMessage("Wow");

    }
}
