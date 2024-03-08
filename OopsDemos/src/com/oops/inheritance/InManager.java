package com.oops.inheritance;

public class InManager extends InEmployee{
    double salary;

//    InManager(){
//        employeeName = "Priya";
//        employeeId=101;
//        salary=1000;
//    }



    public InManager(String employeeName, int employeeId, double salary) {
        super(employeeName, employeeId);
        this.salary = salary;
    }

    void printBonus(double amount){

        System.out.println("Bonus " +(amount+salary));
    }
}
