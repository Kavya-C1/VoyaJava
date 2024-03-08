package com.oops.stat;

public class Trail {
    static int x;
    static int y=10;

    static {
        System.out.println("in static block1");
        x=200;
    }

    static {
        System.out.println("in static block2");
        x=200;
    }
    static void getMessage(){
        System.out.println("in static method");
        System.out.println("Sum "+(x+y));
    }

    public static void main(String[] args) {
        System.out.println("in main");
        getMessage();
        System.out.println("Sum "+(x+y));

    }
}
