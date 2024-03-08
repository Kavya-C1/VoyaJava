package com.oops.overloading;

public class VehicleMain {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.getDetails();

        System.out.println(" ");

        Vehicle vehicle2 = new Vehicle("hyundai");
        vehicle2.getDetails();
        System.out.println(" ");


        Vehicle vehicle3 = new Vehicle("hyndai","ertiga");
        vehicle3.getDetails();
        System.out.println(" ");

        Vehicle vehicle4 = new Vehicle("hyundai",50000,"ertiga");
        vehicle4.getDetails();


    }
}
