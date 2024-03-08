package com.inter.basics;

public abstract class Vehicle implements IInsurance {
    String brand;
    String model;
    double price;

    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void getDetails(){
        System.out.println(this.brand);
    }

    abstract  void getMileage();


    @Override
    public void InsuranceDetails() {
        System.out.println("Insurance");
    }
}
