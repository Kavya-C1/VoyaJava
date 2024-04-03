package com.practice.inherpm;

import java.util.Scanner;

public class Cars extends Showroom implements utility{

    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void getDetails(){
        System.out.println("NAME: " + carName);
        System.out.println("COLOR: " + carColor);
        System.out.println("FUEL TYPE: " +carFuelType);
        System.out.println("PRICE: " + carPrice);
        System.out.println("CAR TYPE: " + carType);
        System.out.println("TRANSMISSION: " + carTransmission);
    }

    @Override
    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================= *** ENTER CAR DETAILS *** =================================");
        System.out.println();
        System.out.println("CAR NAME: ");
        carName = sc.nextLine();
        System.out.println("CAR COLOR: ");
        carColor = sc.nextLine();
        System.out.println("CAR TYPE (PETROL/DIESEL): ");
        carFuelType = sc.nextLine();
        System.out.println("CAR PRICE");
        carPrice = sc.nextInt();
        sc.nextLine();
        System.out.println("CAR TYPE(SEDEN/SUV/HATCHBACK): ");
        carType = sc.nextLine();
        System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        carTransmission = sc.nextLine();
        totalCarsInStock++;
    }
}
