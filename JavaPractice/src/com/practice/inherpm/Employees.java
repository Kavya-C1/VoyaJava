package com.practice.inherpm;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{

    String empId;
    String empName;
    int empAge;
    String empDepartment;


    @Override
  public void getDetails(){
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Age: " + empAge);
        System.out.println("Department: " + empDepartment);
        System.out.println("Showroom name: " +showroomName);


    }

    @Override
    public void setDetails(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        empId = String.valueOf(uuid);
        System.out.println("============================= *** ENTER EMPLOYEE DETAILS *** ==========================");
        System.out.println();
        System.out.println("EMPLOYEE NAME: ");
        empName = sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        empAge = sc.nextInt();
        sc.nextLine();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        empDepartment = sc.nextLine();
        System.out.println("SHOWROOM NAME: ");
        showroomName = sc.nextLine();

    }

}
