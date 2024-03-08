package com.api.lang;

public class HashDemo {



    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("x100","Audi","black");
        Vehicle vehicle2 = new Vehicle("x100","Audi", "white");
        Vehicle vehicle3 = new Vehicle("a100","audi","white");
        Vehicle vehicle4 = new Vehicle("x100","audi","black");


        System.out.println(vehicle1.equals(vehicle2));
        System.out.println(vehicle1.equals(vehicle3));
        System.out.println(vehicle1.equals(vehicle4));

        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
        System.out.println(vehicle4.hashCode());
    }
}
