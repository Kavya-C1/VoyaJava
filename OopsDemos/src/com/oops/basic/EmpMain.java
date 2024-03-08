package com.oops.basic;

public class EmpMain {
    public static void main(String[] args) {
//        System.out.println("welcome");
//        Employee employee = new Employee();
//        employee.employeeName = "Raju";
//        employee.employeeId=12;
//        employee.salary=2000;

        Employee employee = new Employee("Raju",12,2000);
        employee.getDetails();
        String greetEmployee = employee.greet("Welcome");
        System.out.println(greetEmployee);

//        System.out.println("Name " + employee.employeeName);
//        System.out.println("Id " + employee.employeeId);
//        System.out.println("Id " + employee.salary);
    }

}
