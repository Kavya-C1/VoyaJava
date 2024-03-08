package com.oops.inheritance;

public class InEmployee {

    String employeeName;
    int employeeId;

//    InEmployee(){
//        employeeName = "Sri";
//        employeeId=10;
//    }


    public InEmployee() {

    }

    public InEmployee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    void getDetails(){
        System.out.println(employeeName + " " + employeeId);
    }

}
