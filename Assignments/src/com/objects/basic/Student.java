package com.objects.basic;

public class Student {
    String studentName;
    String studentDepartment;

    public Student(String studentName, String studentDepartment) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }

    void printDetails() {
        System.out.println("Student name: " + studentName);
        System.out.println("Student department: " + studentDepartment);
    }

    String getGrades(int... marks) {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 90 && marks[i] <= 100) {
                return "A Grade";
            } else if (marks[i] > 80 && marks[i] <= 90) {
                return "B Grade";
            } else if (marks[i] > 70 && marks[i] <= 80) {
                return "C Grade";
            } else if (marks[i] > 60 && marks[i] <= 70) {
                return "D Grade";
            } else if (marks[i] > 50 && marks[i] <= 59) {
                return "E Grade";
            } else if (marks[i] > 0 && marks[i] <= 49){
                return "Fail";
            }
        }
        return "Enter correct marks";
    }
}