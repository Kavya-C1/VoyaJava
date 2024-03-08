package com.objects.overloading;

import com.objects.overloading.Employee;

import java.util.Scanner;
public class OverLoadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String[] empList = new String[3];
//        for(int i=0; i< empList.length; i++)

        for(int i=0; i< 3; i++) {
            String name = sc.next();
            String designation = sc.next();

            Employee employee = new Employee(name, designation);


//            if (employee.designation == "programmer") {
//                System.out.println("Your allowance is" + employee.calcBonus(20000));
//            } else if (employee.designation == "manager") {
//                System.out.println("Your allowance is" + employee.calcBonus(20000, 10000, "sweets"));
//            } else if (employee.designation == "director") {
//                System.out.println("Your allowance is" + employee.calcBonus(20000, "amazon card", 10000, 5000));
//            }

            if (designation.equals("programmer")) {
                System.out.println("Your allowance is" + employee.calcBonus(20000));
            } else if (designation.equals("manager")) {
                System.out.println("Your allowance is" + employee.calcBonus(20000, 10000, "sweets"));
            } else if (designation.equals("director")) {
                System.out.println("Your allowance is" + employee.calcBonus(20000, "amazon card", 10000, 5000));
            }



        }

//        Employee emp = new Employee("raj", "programmer");
//                emp.calcBonus(2200);
//
//        Employee emp1 = new Employee("raj", "manager");
//        emp.calcBonus(2200,200,"car");
//
//        Employee emp2 = new Employee("raj", "director");
//        emp.calcBonus(2200,"laptop",200,800);


    }
}
