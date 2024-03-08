package com.oops.overloading;

public class Vehicle {
    String brand;
    double price;
    String model;

    public Vehicle() {
//super();
        System.out.println("default");
    }

    public Vehicle(String brand) {
//        this.brand = brand;
        this();
        System.out.println("one");
        this.brand = brand;
    }

    public Vehicle(String brand, String model) {
//        this.brand = brand;
//        this.model = model;

        this(brand);
        System.out.println("two");
        this.brand = brand;
    }

    public Vehicle(String brand, double price, String model) {
//        this.brand = brand;
//        this.price = price;
//        this.model = model;

        this(model,brand);
        System.out.println("three");
        this.brand= brand;


    }

//    void getDetails()
//    {
//        System.out.println(brand);
//        System.out.println(brand + " "+ model);
//        System.out.println(brand + " " + model + " " + price);
//    }

    void getDetails() {
        if(model!=null)
            System.out.println("Model: "+model);
        if(brand!=null)
            System.out.println("brand: "+brand);
//        if(price!=null)
//            System.out.println("price"+price);
        if(price>0)
            System.out.println("Price: " + price);
    }

}
