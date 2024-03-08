package com.oops.bean;

public class VehicleBeanMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Honda");
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle);
    }
}
