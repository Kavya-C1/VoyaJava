package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles =
                Arrays.asList(
                        new Vehicle("City", "Honda", 23_90_000),
                        new Vehicle("Hexa", "Tata", 12_90_000),
                        new Vehicle("Santro", "Hyundai", 43_90_000),
                        new Vehicle("A100", "Audi", 45_90_000),
                        new Vehicle("X10", "Maruthi", 1190000)
                        );
for (Vehicle vehicle:vehicles){
    System.out.println(vehicle);
}
        System.out.println(" ");
        System.out.println("Sort By Brand");

        Collections.sort(vehicles,new BrandSort());
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println(" ");
        System.out.println("Sort By Model");
        Collections.sort(vehicles,new ModelSort());
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println(" ");
        System.out.println("Sort By Price");
        Collections.sort(vehicles,new PriceSort());
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

    }
}
