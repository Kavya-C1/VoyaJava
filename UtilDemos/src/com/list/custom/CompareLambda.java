package com.list.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareLambda {
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
//        Collections.sort(vehicles,(o1, o2)->o1.getBrand().compareTo(o2.getBrand()));
//        Collections.sort(vehicles,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
//        Collections.sort(vehicles,(o1, o2)->{
//            return ((Double)o1.getPrice()).compareTo(o2.getPrice());
//        });

        System.out.println("By Brand");
        Collections.sort(vehicles,(o1, o2)->o1.getBrand().compareTo(o2.getBrand()));
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }
        System.out.println("By Model");
        Collections.sort(vehicles,(o1, o2)->o1.getModel().compareTo(o2.getModel()));
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

        System.out.println("By Price");
        Collections.sort(vehicles,(o1, o2)->{
            return ((Double)o1.getPrice()).compareTo(o2.getPrice());
        });
        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle);
        }

}
}
